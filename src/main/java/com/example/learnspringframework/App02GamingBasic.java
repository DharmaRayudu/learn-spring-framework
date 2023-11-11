package com.example.learnspringframework;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.learnspringframework.HelloWorldConfiguration.Address;
import com.example.learnspringframework.HelloWorldConfiguration.Person;

public class App02GamingBasic {

	public static void main(String[] args) {
		
		//Launching the Spring 
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//We can call beans either bean name or Bean type
		
		//System.out.println(context.getBean("name"));
		//System.out.println(context.getBean("age"));
		//System.out.println(context.getBean("person"));
		//Person p =  (Person) context.getBean("person");
	
		//System.out.println(p.name());
		//System.out.println(p.age());
		 
		
//		Address address = (Address) context.getBean("address1");
//		System.out.println(address);
//		System.out.println(address.city() + " "+address.country());
//		
//		
//		var address1  =  context.getBean(Address.class); // Getting bean by it's type
//		System.out.println(address1);
		
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("personWithMethodCalls"));
		System.out.println(context.getBean("personWithArguments"));
		
		//var add =  context.getBean(Address.class);
		//System.out.println(add);
		 
		
		//System.out.println("Print Alll the Beans!!");
		
		
		//Printing before java8
		//String[]  beans = context.getBeanDefinitionNames();
		
//		for(var bean: beans) {
//			System.out.println(bean);
//		}
		
		//Using java8
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		//System.out.println(context.getBeanDefinitionCount());
		
		//Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		//Person person = context.getBean(Person.class);
		
		//System.out.println(person);
		
		Address address =  context.getBean(Address.class);
		System.out.println(address);
		
		Person person =  context.getBean(Person.class);
		System.out.println(person);
		
	}

}
