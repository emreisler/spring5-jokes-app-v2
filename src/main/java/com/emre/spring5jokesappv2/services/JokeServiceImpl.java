package com.emre.spring5jokesappv2.services;


import com.emre.spring5jokesappv2.components.JokeComponent;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final JokeComponent jokeComponent;

    public JokeServiceImpl(JokeComponent jokeComponent) {
        this.jokeComponent = jokeComponent;
    }


    @Override
    public String getJoke() {
        return jokeComponent.getRandomQuote();
    }
}
