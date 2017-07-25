package me.satoshiyamamoto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by satoshi on 2017/07/24.
 */
@Component
public class AppRunner implements CommandLineRunner {

    private ProductService productService;

    public AppRunner(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        String productName = "ホチキス";
        productService.addProduct(new Product(productName, 100));
        productService.findProduct(productName);
        productService.findProduct(productName);
        productService.findProduct(productName);

        productService.addProduct(new Product(productName, 200));
        productService.findProduct(productName);
        productService.findProduct(productName);
        productService.findProduct(productName);
    }
}
