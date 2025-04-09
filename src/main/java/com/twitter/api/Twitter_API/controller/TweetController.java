package com.twitter.api.Twitter_API.controller;

import com.twitter.api.Twitter_API.entity.Tweet;

import java.util.List;

public interface TweetController {

    public Tweet saveTweet(Tweet tweet);
    public List<Tweet> getAllTweets(Tweet tweet);
    public Tweet getTweetById(Long id);
    public Tweet updateTweet(Long id, Tweet updatedTweet);
}
