package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> showAll();

    void add(Product product);

    Product findById(int id);

    int findByIdProduct(int id);

    void update(int id, Product product);

    void remove(int id);
}
