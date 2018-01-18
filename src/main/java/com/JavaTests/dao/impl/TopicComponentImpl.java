package com.JavaTests.dao.impl;

import com.JavaTests.entity.Topic;
import com.JavaTests.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TopicComponentImpl {

    @Autowired
    TopicRepository topicRepository;

    public Iterable<Topic> getTheme() {
        return topicRepository.findAll();
    }

}
