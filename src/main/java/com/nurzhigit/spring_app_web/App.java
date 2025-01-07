package com.nurzhigit.spring_app_web;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


        System.out.println(firstmusicPlayer.toString()); // com.nurzhigit.spring_app_web.MusicPlayer@4988d8b8
        System.out.println(secondmusicPlayer.toString()); // com.nurzhigit.spring_app_web.MusicPlayer@4988d8b8
        // В Spring бины по умолчанию создаются с областью видимости (scope) как singleton, что означает,
        // что для каждого бина создается только один экземпляр на весь контекст приложения.

        context.close();
    };


}
