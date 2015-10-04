package br.com.diegolovison.sale.client;

import br.com.diegolovison.product.domain.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by diego.lovison on 02/10/2015.
 */
@FeignClient("product-service")
@RequestMapping(value = "/product")
// TODO http://stackoverflow.com/questions/29284911/can-a-spring-cloud-feign-client-share-interface-with-an-spring-web-controller
public interface ProductClient {

    @RequestMapping(method = RequestMethod.GET)
    List<Product> getProducts();
}
