package com.learning.abstractfactory.example1.impl.color;

import com.learning.abstractfactory.example1.Color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
