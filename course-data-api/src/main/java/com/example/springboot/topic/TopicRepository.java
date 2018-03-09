package com.example.springboot.topic;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

//CrudRepository<EntityClassName, PrimaryKeyType>
public interface TopicRepository extends CrudRepository<Topic, Integer> {

    // To query all the topics by name what we have to do is only defining the below method
    // data jpa will do the searching by name in the database
    public List<Topic> findByName(String name);
}
