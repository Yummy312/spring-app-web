package com.nurzhigit.spring_app_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalmusic;

    public MusicPlayer (ClassicalMusic classicalmusic) {
        this.classicalmusic = classicalmusic;
    }

    @Autowired
    public void setClassicalmusic(ClassicalMusic classicalmusic) {
        this.classicalmusic = classicalmusic;
    }

    public void playMusic(){
        System.out.println("Playing: " + classicalmusic.getSong());
    }


}
