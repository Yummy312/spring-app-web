package com.nurzhigit.spring_app_web;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind Cries Mary";
    }
}
