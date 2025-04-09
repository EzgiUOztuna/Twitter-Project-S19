package com.twitter.api.Twitter_API.controller.controllerImpl;
import com.twitter.api.Twitter_API.controller.TweetController;
import com.twitter.api.Twitter_API.entity.Tweet;
import com.twitter.api.Twitter_API.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/api/tweet")
public class TweetControllerImpl implements TweetController {

    @Autowired
    private TweetService tweetService;

    @PostMapping("/save")
    @Override
    public Tweet saveTweet(@RequestBody Tweet tweet) {
        return tweetService.saveTweet(tweet);
    }

    @GetMapping("/get/all")
    @Override
    public List<Tweet> getAllTweets(Tweet tweet) {
        return tweetService.getAllTweets(tweet);
    }


}
