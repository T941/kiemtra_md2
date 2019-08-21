package com.codegym.service.Impl;

import com.codegym.model.Product;
import com.codegym.repository.Impl.ProductRepositoryImpl;
import com.codegym.service.ProductService;

import java.util.List;

public class ProductServiceImpl  implements ProductService {
    ProductRepositoryImpl productRepository=new ProductRepositoryImpl();


    @Override
    public void delete(int index) {
        productRepository.delete(index);

    }

    @Override
    public void edit(int index, Product product) {
        productRepository.edit(index,product);

    }

    @Override
    public int find(String name) {
        return productRepository.find(name);

    }

    @Override
    public void sortDownPrice() {
        productRepository.sortDownPrice();

    }

    @Override
    public void sortUpPrice() {
        productRepository.sortUpPrice();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);

    }
}
