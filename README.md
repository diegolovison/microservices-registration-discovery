# Microservices - Service Register and Discovery

Using Spring Boot, Netflix Eureka and Netflix Zuul Proxy tecnologies we are able create a microservice application.

To run the application just execute the following classes:

  - ServiceRegistrationServer
  - CustomerServer
  - ProductServer
  - SaleServer
  - ProxyServer

The application will be available via the following links:

* http://localhost:1111
* http://localhost:2222/customer
* http://localhost:3333/product
* http://localhost:4444/sale

or via proxy:

* http://localhost:5555/customer
* http://localhost:5555/product
* http://localhost:5555/sale