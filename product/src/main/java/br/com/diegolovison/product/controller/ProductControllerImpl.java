package br.com.diegolovison.product.controller;

import br.com.diegolovison.product.domain.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by diego.lovison on 03/10/2015.
 */
@RestController
public class ProductControllerImpl implements ProductController {

    @Override
    public List<Product> findAll() {

        return Arrays.asList(new Product("tablet"), new Product("cell phone"));
    }
}
