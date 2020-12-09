package com.lzz.service;

import com.lzz.dao.MovieMapper;
import com.lzz.pojo.Movies;

import java.util.List;

public class MovieServiceImpl implements MovieService {
    private MovieMapper movieMapper;

    public void setMovieMapper(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    public List<Movies> queryMovies() {
        return movieMapper.queryMovies();
    }
}
