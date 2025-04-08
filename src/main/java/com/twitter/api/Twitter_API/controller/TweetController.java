/*
package com.twitter.api.Twitter_API.controller;
import com.twitter.api.Twitter_API.dto.TweetResponse;
import com.twitter.api.Twitter_API.entity.Tweet;
import com.twitter.api.Twitter_API.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tweet")
public class TweetController {  //düzenlenecek!!
    private TweetService tweetService;

    @Autowired
    public TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TweetResponse save(@RequestBody Tweet tweet){
        Tweet savedTweet = tweetService.save(tweet);

        tweetService.save(savedTweet);
        return new TweetResponse(savedTweet.getContent(), savedTweet.getCreatedAt());
    }

    @GetMapping("/{userId}")
    public List<TweetResponse> findByUserId(@PathVariable("userId") Long id){
        List<Tweet> tweets = tweetService.findByUserId(id);
        return tweets.stream().map(tweet -> new TweetResponse(tweet.getContent(), tweet.getCreatedAt())).toList();
    }

    @GetMapping("/{id}")
    public TweetResponse findById(@PathVariable("id") Long id){
        Tweet tweet = tweetService.findById(id);

        if (tweet == null) {
            return null;
            //throw new TweetNotFoundException("Tweet not found with id: " + id);
        }

        return new TweetResponse(tweet.getContent(), tweet.getCreatedAt());
    }

    @PutMapping("/{id}")
    public TweetResponse update(@PathVariable("id") Long id, @RequestBody Tweet tweet) {
        Tweet existingTweet = tweetService.findById(id);
        if (existingTweet == null) {
            return null;
            //throw new TweetNotFoundException("Tweet not found with id: " + id);
        }

        if(tweet.getContent() != null){
            existingTweet.setContent(tweet.getContent());
        }
        if(tweet.getUser() != null){
            existingTweet.setUser(tweet.getUser());
        }
        if(tweet.getCreatedAt() != null){
            existingTweet.setCreatedAt(tweet.getCreatedAt());
        }

        Tweet updatedTweet = tweetService.update(id, existingTweet);
        return new TweetResponse(updatedTweet.getContent(), updatedTweet.getCreatedAt());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id, @RequestParam("userId") Long userId) {
        tweetService.delete(id, userId);
    }



}

 */
