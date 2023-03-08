package com.min.log.Tag.repository;

import com.min.log.Tag.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<TagEntity , Integer> {
}
