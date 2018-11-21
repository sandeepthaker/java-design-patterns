package com.learning.abstractfactory.example1.impl.shape;

import com.learning.abstractfactory.example1.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}