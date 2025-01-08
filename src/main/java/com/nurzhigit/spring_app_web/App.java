package com.nurzhigit.spring_app_web;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong()); // Hungarian Rhapsody

        MusicPlayer musicPlayer = new MusicPlayer(classicalMusic);
        musicPlayer.playMusic(); // Playing: Hungarian Rhapsody

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rockMusic.getSong());

        MusicPlayer musicPlayer2 = new MusicPlayer(rockMusic);
        musicPlayer2.playMusic();


        context.close();
    };


}
