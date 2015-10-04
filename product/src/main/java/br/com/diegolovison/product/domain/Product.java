package br.com.diegolovison.product.domain;

import lombok.Data;

/**
 * Created by diego.lovison on 02/10/2015.
 */
@Data
public class Product {

    public Product() {}

    public Product(String name) {
        this.name = name;
    }

    String name;
}
