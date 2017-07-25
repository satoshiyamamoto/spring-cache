package me.satoshiyamamoto;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCacheApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ProductService productService = context.getBean(ProductService.class);
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
