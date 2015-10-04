package br.com.diegolovison.sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by diego.lovison on 02/10/2015.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SaleServer {

    public static void main(String[] args) {

        SpringApplication.run(SaleServer.class, args);
    }
}
