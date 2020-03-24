package com.company;

public class whale extends mammalia implements swimable
{
    whale()
    {
        type="고래";
    }



    @Override
    public void swim() {
        System.out.println(type+"헤엄");
    }
}
