package com.example.springboot.topic;

import org.springframework.data.repository.CrudRepository;

//CrudRepository<EntityClassName, PrimaryKeyType>
public interface TopicRepository extends CrudRepository<Topic, Integer> {
}
