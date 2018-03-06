/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pettopia.model.database;

import com.pettopia.model.bean.Product;
import com.pettopia.model.bean.User;
import com.pettopia.model.databaseInterfaces.ProductsDatabaseOperationInterface;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmedelgawesh
 */
public class ProductDao implements ProductsDatabaseOperationInterface {

    ProductsCrud productsCrud;

    public ProductDao() {
        productsCrud = new ProductsCrud();
    }

    @Override
    public boolean buyProduct(int productId) {


        String strStatment = "update petproducts set sold_yn='y'  where productid='" +productId+ "')";
        return productsCrud.update(strStatment);

    }

    
    @Override
    public ArrayList<Product> getAllProducts(){
        String statement = "select * from petproducts where lower(sold_yn)='n'";
        return productsCrud.getAll(statement);
    }
    @Override
    public boolean insertProducts(Product productsInformations) {

        String strStatment = "insert into petproducts (productname,productprice,sold_yn,productdescription,category) values ('" + productsInformations.getName() + "','" + productsInformations.getPrice() + "','n','" + productsInformations.getDescription() + "','" + productsInformations.getCategory() + "')";
        return productsCrud.insert(strStatment);
    }

    @Override
    public boolean updateProducts(Product productsInformations) {

        String strStatment = "update petproducts set productname='" + productsInformations.getName() + "',productprice='" + productsInformations.getPrice() + "',sold_yn='" + productsInformations.getQuantity() + "',productdescription='" + productsInformations.getDescription() + "',category='" + productsInformations.getCategory() + "' where productid='" + productsInformations.getId() + "')";
        return productsCrud.update(strStatment);
    }

    @Override
    public boolean deleteProducts(int productId) {
        String strStatment = "delete  from petproducts where productid ='" +productId+ "' ";
        return productsCrud.update(strStatment);
    }

    @Override
    public ArrayList<Product> selectProducts(String productsName) {
        String selectStatement = "select  * from petproducts where  productname= '" + productsName + "'";
        return productsCrud.select(selectStatement);
    }

    @Override
    public Product selectOneProduct(int productId) {
        
         String selectStatement = "select  * from petproducts where  productid= '" + productId + "'";
        return productsCrud.select(selectStatement,"one");

    }

    @Override
    public int getNextSeq() {
     
        String ss = "select PRODUCTS_SEQ.currval from dual";
        return productsCrud.getLast(ss);
    }
    
    
    
    

}
