package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.Impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    ProductServiceImpl productService =new ProductServiceImpl();

    public List<Product> findAll(){
        return productService.findAll();
    }
    public void delete (int index){
        productService.delete(index);
    }
    public void addProduct(Product product) {
        productService.add(product);
    }
    public void edit (int index, Product product){
        productService.edit(index,product);
    }
    public void find (String name){
        productService.find(name);
    }
    public void sortUpPrice() {
        productService.sortUpPrice();
    }
    public void sortDownPrice() {
        productService.sortDownPrice();
    }
}
