package com.twitter.api.Twitter_API.repository;

import com.twitter.api.Twitter_API.entity.Retweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetweetRepository extends JpaRepository<Retweet, Long> {
}
