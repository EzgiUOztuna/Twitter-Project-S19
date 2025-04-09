package com.twitter.api.Twitter_API.service;

import com.twitter.api.Twitter_API.entity.Tweet;

import java.util.List;

public interface TweetService {

    public Tweet saveTweet(Tweet tweet);
    public List<Tweet> getAllTweets(Tweet tweet);
    public Tweet getTweetById(Long id);
}
