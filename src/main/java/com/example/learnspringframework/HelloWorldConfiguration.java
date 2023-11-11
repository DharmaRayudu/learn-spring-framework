package com.example.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {
	
	
	//record is introduced in java15, using this we can create an immutable class.
	//It will avoid a lot of boilerplate code, like getter setters equals and hash,we no need to to crate a extra class
	
	public record Person(String name, int age, Address address) {};
	
	public record Address(String city, String country) {};
	
	@Bean
	public String name() {
		System.out.println("Bean name() Initialization started");
		return "Dharma Rayudu";
	}

	@Bean
	public Integer age() {
		System.out.println("Bean age() Initialization started");
		return 30;
	}
	
	@Bean 
	@Primary
	public Person person() {
		System.out.println("Bean person() Initialization started");
		return new Person("Satish", 35, new Address("Bangalore", "India"));
	}
	
	@Bean(name = "address1")
	@Primary
	public Address address() {
		return new Address("Hyderabad", "India");
	}
	
	@Bean(name = "address2")
	@Qualifier("address2Quali")
	public Address address2() {
		return new Address("Chennai", "India");
	}
	
	//Use existing beans
	// One way is that we can call directly methods into new Bean
	
	@Bean
	public Person personWithMethodCalls() {
		return new Person(name(), age(), address());
	}
	
	//Second way is we can pass existing beans as arguments.
	@Bean
	public Person personWithArguments(String name, Integer age, @Qualifier("address2Quali") Address address2) {
		return new Person(name, age, address2);
	}
	
}
