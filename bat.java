package com.company;

public class bat extends mammalia implements flyable
{
    bat()
    {
        type="박쥐,조류";
    }

    @Override
    public void fly() {
        System.out.println(type+"난다.");
    }
}
