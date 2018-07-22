package com.example.webfluxdemo.exception;

/**
 * Created by RANGAREJ on 22/10/17.
 */
public class TweetNotFoundException extends RuntimeException {

    public TweetNotFoundException(String tweetId) {
        super("Tweet not found with id " + tweetId);
    }
}
