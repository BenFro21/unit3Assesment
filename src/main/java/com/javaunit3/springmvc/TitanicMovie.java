package com.javaunit3.springmvc;

import org.springframework.stereotype.Component;

@Component
public class TitanicMovie implements Movie{

    public String getTitle(){
        return "Titanic";
    }

    public  String getMaturityRating(){
        return "R";
    }

    public String getGenre(){
        return "Romantic Drama";
    }
}
