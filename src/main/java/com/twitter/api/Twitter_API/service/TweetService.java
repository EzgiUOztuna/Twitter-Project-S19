package com.twitter.api.Twitter_API.service;

import com.twitter.api.Twitter_API.entity.Tweet;
import com.twitter.api.Twitter_API.entity.User;

import java.util.List;

public interface TweetService {
    Tweet save(Tweet tweet);
    List<Tweet> findByUserId(Long userId);
    Tweet findById(Long id);
    Tweet update(Long id, Tweet tweet);
    void delete(Long id, Long userId);  //🚨(Sadece tweet sahibi ilgili tweeti silebilimelidir.)
    List<Tweet> findAll();
}
