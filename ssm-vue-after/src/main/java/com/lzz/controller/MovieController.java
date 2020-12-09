package com.lzz.controller;

import com.alibaba.fastjson.JSON;
import com.lzz.pojo.Movies;
import com.lzz.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin  //跨域请求
@ResponseBody
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping(value = {"/","/movies"})
    public String movieIndex(){
        List<Movies> movies=movieService.queryMovies();
        String moviesJson= JSON.toJSONString(movies);
        return moviesJson;
    }
}
