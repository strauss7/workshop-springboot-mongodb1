package com.amira.workshopmongodb1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amira.workshopmongodb1.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
}
