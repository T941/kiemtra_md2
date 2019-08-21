package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface ProductRepository extends GeneralRepository<Product> {
    @Override
    List<Product> findAll();

    @Override
    void add(Product product);

    @Override
    void edit(int index, Product product);

    void delete(int index);
    int find (String name);
    void sortUpPrice();
    void sortDownPrice();

}
