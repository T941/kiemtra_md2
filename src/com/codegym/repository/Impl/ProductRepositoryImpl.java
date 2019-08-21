package com.codegym.repository.Impl;

import java.util.Collections;
import java.util.Comparator;
import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;
import java.util.ArrayList;

public class ProductRepositoryImpl implements ProductRepository {
    ArrayList<Product> list = new ArrayList<Product>();

    @Override
    public void edit(int index, Product product) {
        list.set(index, product);
    }

    @Override
    public void delete(int index) {
        check(index);
        list.remove(index);

    }

    @Override
    public int find(String name) {
        for (int i = 0; i < list.size(); i++) {
            String productName = list.get(i).getName();
            if (productName.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sortUpPrice() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });


    }

    @Override
    public void sortDownPrice() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });
    }

    @Override
    public ArrayList<Product> findAll() {
        return list;
    }

    @Override
    public void add(Product product) {
        list.add(product);
    }

    public void check(int index) {
        if (index < 0 || index > list.size()) {
            throw new IndexOutOfBoundsException("Không có trong mảng!");
        }
    }
}

