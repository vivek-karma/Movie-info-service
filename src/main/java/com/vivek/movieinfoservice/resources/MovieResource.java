package com.vivek.movieinfoservice.resources;

import com.vivek.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieResource {

    @RequestMapping("/{movieName}")
    public Movie getMovie(@PathVariable("movieName") String movieName){
        return new Movie(movieName,"heroes are born to save the world");
    }
}
