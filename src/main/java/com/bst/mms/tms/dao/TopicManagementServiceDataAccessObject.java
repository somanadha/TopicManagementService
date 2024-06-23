package com.bst.mms.tms.dao;

import com.bst.mms.tms.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TopicManagementServiceDataAccessObject extends JpaRepository<Topic, Integer> {
    Optional<Topic> findByName(String name);
}
