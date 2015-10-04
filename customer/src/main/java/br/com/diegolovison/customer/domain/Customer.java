package br.com.diegolovison.customer.domain;

import lombok.Data;

/**
 * Created by diego.lovison on 02/10/2015.
 */
@Data
public class Customer {

    public Customer() {}

    public Customer(String name) {
        this.name = name;
    }

    String name;
}
