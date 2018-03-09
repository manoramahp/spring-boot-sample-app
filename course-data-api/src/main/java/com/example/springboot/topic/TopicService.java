package com.example.springboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Mark the class as a spring business service
//By default spring business services are singleton
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getTopics() {
        ArrayList<Topic> topicArrayList = new ArrayList<>();
        topicRepository.findAll().forEach(topicArrayList::add);
        return topicArrayList;
    }

    public Topic getTopic(int id) {
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    // save() method does both save and update
    public void update(Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(int id) {
        topicRepository.delete(id);
    }
}
