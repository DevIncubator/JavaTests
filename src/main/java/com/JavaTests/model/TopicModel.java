package com.JavaTests.model;


import com.JavaTests.entity.Topic;

public interface TopicModel {
    String getTopic();

    String getTopicSave();

    Topic getTopicRest(Topic topic);
}
