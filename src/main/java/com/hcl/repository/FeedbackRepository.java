package com.hcl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Feedback;

@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Long>{

}
