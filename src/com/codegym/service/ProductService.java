package com.codegym.service;

import com.codegym.model.Product;

public interface ProductService extends GeneralService<Product> {
    void delete(int index);
    void edit (int index, Product product);
    int find (String name);
    void sortDownPrice();
    void sortUpPrice();

}

