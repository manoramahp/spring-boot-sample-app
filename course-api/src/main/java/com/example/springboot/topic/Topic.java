package com.example.springboot.topic;

public class Topic {
    String topicName;
    String category;
    int id;

    public Topic(String topicName, String category, int id) {
        this.topicName = topicName;
        this.category = category;
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
