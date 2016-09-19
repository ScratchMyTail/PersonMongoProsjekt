package com.example;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by christerhansen on 19.09.2016.
 */
public interface PersonRepository extends MongoRepository<Person, String> {
    public List<Person> findAll();
    public Person save(Person person);
}
