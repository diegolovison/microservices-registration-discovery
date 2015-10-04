package br.com.diegolovison.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by diego.lovison on 02/10/2015.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ProductServer {

    public static void main(String... args) {

        SpringApplication.run(ProductServer.class, args);
    }
}
