package com.twitter.api.Twitter_API.controller.controllerImpl;
import com.twitter.api.Twitter_API.controller.TweetController;
import com.twitter.api.Twitter_API.entity.Tweet;
import com.twitter.api.Twitter_API.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
