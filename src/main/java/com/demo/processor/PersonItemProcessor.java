package com.demo.processor;

import org.springframework.batch.item.ItemProcessor;

import com.demo.entity.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	@Override
	public Person process(Person person) throws Exception {
		System.out.println("processing... " + person);
		return person;
	}

}
