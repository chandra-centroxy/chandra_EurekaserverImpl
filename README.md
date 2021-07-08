# ProjectName:-Microservice_With_Springboot (Eureka server impl)
# written by
Chandra

#What is Eureka Server?
Eureka Server is service discovery for your microservices, where all client applications can register by themselves and other microservices look up the Eureka Server to get independent microservices to get the job complete.

Eureka Server is also known as Discovery Server and it contains all the information about client microservices running on which IP address and port.

#Add in pom.xml 

<dependency>
<groupId>org.springframework.cloud</groupId>
<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>

# Implementing Eureka Server
Creating Eureka Server Spring Application

With select below stater i.e
 
Eureka Server

Web

Actuator

# Spring Boot Starter Application
In Your springboot application main class used this annotaion i.e[ @EnableEurekaServer] in class level.

# Application Properties File
You need to add the below list of properties in application.properties located at src/main/resources on your application.

1
spring.application.name=eureka-server
2
server.port=8761
3
eureka.client.register-with-eureka=false
4
eureka.client.fetch-registry=false
spring.application.name is a unique name for your application.

server.port in which your application will be bound and wewill use default port 8761 for eureka server.

eureka.client.fetch-registry doesn't register itself in eureka server.

eureka.client.register-with-eureka is determines if service register itself as a client in eureka server.


# Run Application

URL: http://localhost:8761/

![image](https://user-images.githubusercontent.com/74757221/124871596-d8a10900-dfe1-11eb-98fe-4aea77b0b380.png)

