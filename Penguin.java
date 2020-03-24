package com.company;

public class Penguin extends Birds implements swimable
{
    Penguin()
    {
        type="조류&펭귄";
    }

    @Override
    public void swim() {
        System.out.println(type+"수영한다");
    }
}
