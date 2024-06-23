package com.bst.mms.tms.controller;

import com.bst.mms.tms.entity.Topic;
import com.bst.mms.tms.service.TopicManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("tms")
@RestController
public class TopicManagementServiceController {
    @Autowired
    TopicManagementService topicManagementService;

    @PostMapping("add")
    public ResponseEntity<Topic> addTopic(@RequestBody Topic topic) {
        ResponseEntity<Topic> questionResponseEntity;
        Topic topicCreated = null;
        HttpStatus httpStatus = HttpStatus.OK;

        try {
            topicCreated = topicManagementService.addTopic(topic);
            httpStatus = HttpStatus.CREATED;
        }
        catch (Exception exception) {
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        finally {
            questionResponseEntity = new ResponseEntity<>(topicCreated, httpStatus);
        }
        return questionResponseEntity;
    }

    @GetMapping("findById/{topicId}")
    public ResponseEntity<Topic> findTopicById(@PathVariable Integer topicId) {
        ResponseEntity<Topic> questionResponseEntity;
        Topic topic = null;
        HttpStatus httpStatus = HttpStatus.OK;

        try {
            topic = topicManagementService.findTopicById(topicId).orElse(null);
            httpStatus = HttpStatus.CREATED;
        }
        catch (Exception exception) {
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        finally {
            questionResponseEntity = new ResponseEntity<>(topic, httpStatus);
        }
        return questionResponseEntity;
    }

    @GetMapping("findByName/{name}")
    public ResponseEntity<Topic> findTopicByName(@PathVariable String name) {
        ResponseEntity<Topic> questionResponseEntity;
        Topic topic = null;
        HttpStatus httpStatus = HttpStatus.OK;

        try {
            topic = topicManagementService.findTopicByName(name).orElse(null);
        }
        catch (Exception exception) {
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        finally {
            questionResponseEntity = new ResponseEntity<>(topic, httpStatus);
        }
        return questionResponseEntity;
    }

    @GetMapping("findAll")
    public ResponseEntity<List<Topic>> findAllTopics() {

        ResponseEntity<List<Topic>> topicListResponseEntity;
        List<Topic> topicList = null;
        HttpStatus httpStatus = HttpStatus.OK;

        try {
            topicList = topicManagementService.findAllTopics();
            httpStatus = HttpStatus.CREATED;
        }
        catch (Exception exception) {
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        finally {
            topicListResponseEntity = new ResponseEntity<>(topicList, httpStatus);
        }
        return topicListResponseEntity;
    }
}
