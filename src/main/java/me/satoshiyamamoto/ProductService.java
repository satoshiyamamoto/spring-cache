package me.satoshiyamamoto;

/**
 * Created by satoshi on 2017/07/24.
 */
public interface ProductService {

    Product findProduct(String name);

    void addProduct(Product product);

}
