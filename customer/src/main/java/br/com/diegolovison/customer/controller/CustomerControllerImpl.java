package br.com.diegolovison.customer.controller;

import br.com.diegolovison.customer.domain.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by diego.lovison on 03/10/2015.
 */
@RestController
public class CustomerControllerImpl implements CustomerController {

    @Override
    public List<Customer> findAll() {

        return Arrays.asList(new Customer("diego"), new Customer("fabio"));
    }
}
