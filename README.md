# spring-boot-sample-app

Boostraping a spring application from scratch.

* Spring application
* Production ready
* Standalone
* Can 'just run'
* The embedded tomcat server is useful for microservices architecture.

* For 80% of the use cases we do not need to configure anything.
We just need to use the default comes with the Spring Boot. 
But for the other 20% we have to configure it as needed.

* CrudRepository interface make it easy to perform crud operations on database without writing queries.

* Spring boot actuator for monitoring. This is exposed on management.port in application.properties, 
so that we can easily configure that port. The default is 8080. (http://localhost:8080/health, http://localhost:8080/beans, etc.)

application.properties
https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html
