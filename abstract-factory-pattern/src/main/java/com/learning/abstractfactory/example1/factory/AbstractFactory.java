package com.learning.abstractfactory.example1.factory;

import com.learning.abstractfactory.example1.Color;
import com.learning.abstractfactory.example1.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
