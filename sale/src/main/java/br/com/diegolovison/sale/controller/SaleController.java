package br.com.diegolovison.sale.controller;

import br.com.diegolovison.customer.domain.Customer;
import br.com.diegolovison.product.domain.Product;
import br.com.diegolovison.sale.client.CustomerClient;
import br.com.diegolovison.sale.client.ProductClient;
import br.com.diegolovison.sale.domain.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by diego.lovison on 02/10/2015.
 */
@RestController
@RequestMapping(value="/sale")
public class SaleController {

    @Autowired
    CustomerClient customerClient;

    @Autowired
    ProductClient productClient;

    @RequestMapping(method = RequestMethod.GET)
    List<Sale> findAll() {

        List<Sale> sales = new ArrayList<>();

        List<Customer> customers = customerClient.findAll();
        List<Product> products = productClient.getProducts();

        for (Customer customer : customers) {

            Sale sale = new Sale();
            sale.setCustomer(customer);
            sale.setProducts(products);

            sales.add(sale);
        }

        return sales;
    }
}
