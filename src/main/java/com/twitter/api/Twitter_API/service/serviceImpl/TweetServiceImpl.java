package com.twitter.api.Twitter_API.service.serviceImpl;

import com.twitter.api.Twitter_API.entity.Tweet;
import com.twitter.api.Twitter_API.repository.TweetRepository;
import com.twitter.api.Twitter_API.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetServiceImpl implements TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    @Override
    public Tweet saveTweet(Tweet tweet) {
        return tweetRepository.save(tweet);
    }

    @Override
    public List<Tweet> getAllTweets(Tweet tweet) {
        return tweetRepository.findAll();
    }
}
