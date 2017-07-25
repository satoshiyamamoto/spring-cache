package me.satoshiyamamoto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

/**
 * Created by satoshi on 2017/07/24.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product findProduct(String name) {
        StopWatch sw = new StopWatch();
        sw.start();

        Product product = productDao.findProduct(name);

        sw.stop();
        System.out.printf("%d ms, %s%n", sw.getLastTaskTimeMillis(), product);

        return product;
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }
}
