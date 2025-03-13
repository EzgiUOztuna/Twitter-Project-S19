package com.twitter.api.Twitter_API.exceptions;

import org.springframework.http.HttpStatus;

public class TweetNotFoundException extends ApiException {
    public TweetNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
