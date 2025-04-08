/*
package com.twitter.api.Twitter_API.service.Impl;
import com.twitter.api.Twitter_API.entity.Tweet;
import com.twitter.api.Twitter_API.repository.TweetRepository;
import com.twitter.api.Twitter_API.service.TweetService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TweetServiceImpl implements TweetService {
    private TweetRepository tweetRepository;

    @Override
    public Tweet save(Tweet tweet) {
        return null;
    }

    @Override
    public List<Tweet> findByUserId(Long userId) {
        return List.of();
    }

    @Override
    public Tweet findById(Long id) {
        return null;
    }

    @Override
    public Tweet update(Long id, Tweet tweet) {
        return null;
    }

    @Override
    public void delete(Long id, Long userId) {

    }

    @Override
    public List<Tweet> findAll() {
        return List.of();
    }






    /*
    @Autowired
    public TweetServiceImpl(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }


    @Override
    public Tweet save(Tweet tweet) {
        if(tweet.getUser() == null || tweet.getUser().getId()==null) {
            throw new IllegalArgumentException("User must be specified.");
        }
        return tweetRepository.save(tweet);
    }

    @Override
    public List<Tweet> findByUserId(Long userId) {
        return tweetRepository.findByUserId(userId);
    }

    @Override
    public Tweet findById(Long id) {
        return tweetRepository.findById(id).orElseThrow(() -> new TweetNotFoundException(id + "'li tweet bulunamadı."));
    }

    @Override
    public Tweet update(Long id, Tweet tweet) {
        Tweet existingTweet = tweetRepository.findById(id).orElseThrow(() -> new TweetNotFoundException(id + "'li tweet bulunamadı."));

        if(tweet.getContent() != null){
            existingTweet.setContent(tweet.getContent());
        }
        if(tweet.getCreatedAt() != null){
            existingTweet.setCreatedAt(tweet.getCreatedAt());
        }
        if(tweet.getUser() != null){
            existingTweet.setUser(tweet.getUser());
        }
        return tweetRepository.save(existingTweet);
    }

    @Override
    public void delete(Long id, Long userId) {
        Tweet tweet = tweetRepository.findById(id)
                .orElseThrow(() -> new TweetNotFoundException(id + "'li tweet bulunamadı."));

        // **Tweet sahibi mi kontrol et**
        if (!tweet.getUser().getId().equals(userId)) {
            throw new SecurityException("Bu tweeti silme yetkiniz yok!");
        }
        tweetRepository.deleteById(id);
    }

    @Override
    public List<Tweet> findAll() {
        return tweetRepository.findAll();
    }

}

*/