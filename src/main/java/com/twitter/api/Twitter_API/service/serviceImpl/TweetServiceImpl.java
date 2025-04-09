package com.twitter.api.Twitter_API.service.serviceImpl;

import com.twitter.api.Twitter_API.entity.Tweet;
import com.twitter.api.Twitter_API.repository.TweetRepository;
import com.twitter.api.Twitter_API.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Tweet getTweetById(Long id) {
        Optional<Tweet> optional = tweetRepository.findById(id);

        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
        //return optional.orElse(null); -Bu şekilde kısaca da yazabiliriz. (32-35 satırları)
    }

    @Override
    public Tweet updateTweet(Long id, Tweet updatedTweet) {
        Tweet dbTweet = getTweetById(id);
        if(dbTweet != null){
            dbTweet.setContent(updatedTweet.getContent());
            dbTweet.setCreatedAt(updatedTweet.getCreatedAt());
            dbTweet.setUser(updatedTweet.getUser());

            tweetRepository.save(dbTweet);
        }
        return null;
    }
}
