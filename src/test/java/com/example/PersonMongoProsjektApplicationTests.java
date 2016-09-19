package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonMongoProsjektApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Test
	public void testSavePerson() {
		Person person = new Person("Ola", "Nordmann");
		Person personRetur = personRepository.save(person);
		System.out.println(personRetur.getId());
		Assert.notNull(personRetur.getId());
	}

}
