package br.com.diegolovison.product.controller;

import br.com.diegolovison.product.domain.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by diego.lovison on 02/10/2015.
 */
@RequestMapping(value="/product")
public interface ProductController {

    @RequestMapping(method = RequestMethod.GET)
    List<Product> findAll();
}
