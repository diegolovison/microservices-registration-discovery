package br.com.diegolovison.sale.domain;

import br.com.diegolovison.customer.domain.Customer;
import br.com.diegolovison.product.domain.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.util.List;

/**
 * Created by diego.lovison on 02/10/2015.
 */
public class Sale {

    Customer customer;

    List<Product> products;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
