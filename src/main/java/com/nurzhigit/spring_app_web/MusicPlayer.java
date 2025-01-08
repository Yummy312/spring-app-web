package com.nurzhigit.spring_app_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired
    private ClassicalMusic classicalmusic;

    public void playMusic(){
        System.out.println("Playing: " + classicalmusic.getSong());
    }


}
