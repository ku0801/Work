package com.company;

public class pigeon extends Birds implements flyable
{
    pigeon()
    {
        type="조류&비둘기";
    }

    @Override
    public void fly() {
        System.out.println(type+"난다.");
    }
}
