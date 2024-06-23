package com.bst.mms.tms.service;

import com.bst.mms.tms.dao.TopicManagementServiceDataAccessObject;
import com.bst.mms.tms.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicManagementService {

    @Autowired
    TopicManagementServiceDataAccessObject topicManagementServiceDataAccessObject;

    public Topic addTopic(Topic topic) {
        return topicManagementServiceDataAccessObject.save(topic);
    }

    public Optional<Topic> findTopicById(Integer topicId) {
        return topicManagementServiceDataAccessObject.findById(topicId);
    }

    public Optional<Topic> findTopicByName(String name) {
        return topicManagementServiceDataAccessObject.findByName(name);
    }

    public List<Topic> findAllTopics() {
        return topicManagementServiceDataAccessObject.findAll();
    }
}
