package com.nurzhigit.spring_app_web;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        // область видимости бина prototype означает, что при каждом запросе (через метод getBean(), внедрение зависимости и т.д.)
        // будет создаваться новый экземпляр этого бина, в отличие от области видимости singleton
        System.out.println(firstmusicPlayer.toString()); // com.nurzhigit.spring_app_web.MusicPlayer@7c9d8e2
        System.out.println(secondmusicPlayer.toString()); // com.nurzhigit.spring_app_web.MusicPlayer@20d525


        context.close();
    };


}
