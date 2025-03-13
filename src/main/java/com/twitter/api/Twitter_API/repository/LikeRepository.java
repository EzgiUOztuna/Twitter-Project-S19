package com.twitter.api.Twitter_API.repository;

import com.twitter.api.Twitter_API.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
