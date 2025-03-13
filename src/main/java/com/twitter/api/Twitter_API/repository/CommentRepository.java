package com.twitter.api.Twitter_API.repository;

import com.twitter.api.Twitter_API.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
