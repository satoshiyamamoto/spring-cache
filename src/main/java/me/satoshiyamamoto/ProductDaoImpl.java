package me.satoshiyamamoto;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by satoshi on 2017/07/24.
 */
@Repository
@CacheConfig(cacheNames = "products")
public class ProductDaoImpl implements ProductDao {

    private Map<String, Product> storage = new HashMap<>();

    @Cacheable
    @Override
    public Product findProduct(String name) {
        slowly();
        return storage.get(name);
    }

    @CacheEvict(key = "#product.name")
    @Override
    public void addProduct(Product product) {
        storage.put(product.getName(), product);
    }

    private void slowly() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
