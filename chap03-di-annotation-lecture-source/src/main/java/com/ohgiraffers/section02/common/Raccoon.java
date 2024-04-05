package com.ohgiraffers.section02.common;

import org.springframework.stereotype.Component;

@Component
public class Raccoon implements Animal{
    @Override
    public void eat() {
        System.out.println("너구리가 고기를 뜯어먹어요.");
    }
}
