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

    @PostMapping(path = "/save")
    @Override
    public Tweet saveTweet(@RequestBody Tweet tweet) {
        return tweetService.saveTweet(tweet);
    }

    @GetMapping(path = "/list/all")
    @Override
    public List<Tweet> getAllTweets(Tweet tweet) {
        return tweetService.getAllTweets(tweet);
    }

    @GetMapping(path = "/list/{id}")
    @Override
    public Tweet getTweetById(@PathVariable(name = "id") Long id) {
        return tweetService.getTweetById(id);
    }


}
