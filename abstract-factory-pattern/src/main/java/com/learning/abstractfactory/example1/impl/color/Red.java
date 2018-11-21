package com.learning.abstractfactory.example1.impl.color;

import com.learning.abstractfactory.example1.Color;

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}