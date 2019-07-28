package com.habibridho.learn_rest.repositories;

import com.habibridho.learn_rest.entities.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {

}
