package com.example.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Mark the class as a spring business service
//By default spring business services are singleton
@Service
public class TopicService {

    // Arrays.asList need to be wrapped in new ArrayList
    // This is because Arrays.asList is returning an immutable arrayList to which we cannot add new elements
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring boot", "JavaEE", 1),
            new Topic("AngularJS", "JavaScript", 2),
            new Topic("Servlets", "JavaEE", 3)));

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(int id) {
        return  topics.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void update(int id, Topic topic) {
        for (int i = 0; i<topics.size(); i++) {
            if(topics.get(i).getId() == id) {
                topics.add(i, topic);
            }
        }
    }

    public void deleteTopic(int id) {
        topics.removeIf(topic -> topic.getId() == id);
    }
}
