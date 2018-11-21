package com.learning.abstractfactory.example1.impl.shape;

import com.learning.abstractfactory.example1.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}