package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface GeneralRepository<T> {
    List<T> findAll();
    void add (T t);
    void edit(int index, Product product);
}