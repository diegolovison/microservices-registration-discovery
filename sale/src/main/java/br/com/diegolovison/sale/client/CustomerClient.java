package br.com.diegolovison.sale.client;

import br.com.diegolovison.customer.domain.Customer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by diego.lovison on 03/10/2015.
 */
// TODO http://stackoverflow.com/questions/29284911/can-a-spring-cloud-feign-client-share-interface-with-an-spring-web-controller
@FeignClient("customer-service")
@RequestMapping(value = "/customer")
public interface CustomerClient {

    @RequestMapping(method = RequestMethod.GET)
    List<Customer> findAll();
}
