package com.JavaTests.services.tutorService;

import com.JavaTests.entity.Topic;

import java.util.List;

public interface TopicService {

    void addTopic(Topic topic);

    Topic findByTopicName(String name);

    void deleteTopic(Topic topic);

    void editTopic(Topic topic);

    List<Topic> getTopics();
}
