package com.learning.abstractfactory.example1.impl.shape;

import com.learning.abstractfactory.example1.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
