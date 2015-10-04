package br.com.diegolovison.customer.controller;

import br.com.diegolovison.customer.domain.Customer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by diego.lovison on 02/10/2015.
 */
@RequestMapping(value = "/customer")
public interface CustomerController {

    @RequestMapping(method = RequestMethod.GET)
    List<Customer> findAll();
}
