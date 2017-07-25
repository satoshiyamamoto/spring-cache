package me.satoshiyamamoto;

import lombok.ToString;
import lombok.Value;

import java.io.Serializable;

/**
 * Created by satoshi on 2017/07/24.
 */
@Value
@ToString
public class Product implements Serializable {
    private String name;
    private Integer price;
}
