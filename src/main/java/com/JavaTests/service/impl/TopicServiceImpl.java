package com.JavaTests.service.impl;

import com.JavaTests.dao.impl.TopicComponentImpl;
import com.JavaTests.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TopicServiceImpl {

    @Autowired
    TopicComponentImpl topicComponentImpl;

    public List<Topic> getTheme() {
        ArrayList<Topic> topics = new ArrayList<>();
        for (Topic topic: topicComponentImpl.getTheme()) {
            topics.add(topic);
        }
        return topics;
    }
}
