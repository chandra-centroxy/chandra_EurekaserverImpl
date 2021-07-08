# ProjectName :- Springboot ClientApplication Register with Eureka server 
# wriiten by
Chandra

# Creating Spring Boot Client Application with below stater

DevTools

Actuator

Discovery Client

# Java Spring Server Application
Now you need to open the SpringBootApplication SpringBootClentAppRegisterwithEureka1Application.java and add the annotation @EnableDiscoveryClient  
on the top of the class as shown below.

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootClentAppRegisterwithEureka1Application {
	
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootClentAppRegisterwithEureka1Application.class, args);
	}

}

# Adding REST Controller

Create a sample service using Restcontroller

# Application Properties File
You need to add the below list of properties in application.properties located at src/main/resources.

1
spring.application.name=eureka-client-service
2
server.port=8081
3
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/

eureka.client.service-url.defaultZone determines the address where the Eureka Server is running so the client application can register itself in Eureka Server.

# Running Client Application
Before running the application, you need to make sure the Eureka Server is up and running. Run the client application as a Java application and navigate to 
the Eureka Server at http://localhost:8761/.





