package com.lzz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Movies {
    private Integer id;
    private String movieName;
    private String movieCategories;
    private String movieContent;
    private String movieReleaseTime;
    private int view;
    private String imgSrc;
    private String movieTag;
}
