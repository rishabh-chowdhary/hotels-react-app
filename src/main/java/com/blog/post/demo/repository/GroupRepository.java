package com.blog.post.demo.repository;

/**
 * Created by rishabh.chowdhary on 12/13/18.
 */

import com.blog.post.demo.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
}