package com.tatsam.priority.repository;

import com.tatsam.priority.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityRepository  extends JpaRepository<User,Long> {

}
