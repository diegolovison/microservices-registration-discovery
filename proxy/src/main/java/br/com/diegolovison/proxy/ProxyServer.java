package br.com.diegolovison.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by diego.lovison on 16/10/2015.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ProxyServer {

    public static void main(String... args) {

        SpringApplication.run(ProxyServer.class, args);
    }
}
