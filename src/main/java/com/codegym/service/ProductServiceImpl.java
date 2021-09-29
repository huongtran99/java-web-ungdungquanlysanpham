package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{

    private static List<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(0, "iphone13", "1099", "New","Apple"));
        products.add(new Product(1, "iphone12", "999", "New","Apple"));
        products.add(new Product(2, "iphone11", "888", "New","Apple"));
        products.add(new Product(3, "iphone10", "777", "New","Apple"));
        products.add(new Product(4, "iphone9", "555", "New","Apple"));

    }

    @Override
    public List<Product> showAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public int findByIdProduct(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void update(int id, Product product) {
        products.set(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
