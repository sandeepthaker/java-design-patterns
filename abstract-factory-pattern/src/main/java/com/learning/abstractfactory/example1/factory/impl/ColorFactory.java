package com.learning.abstractfactory.example1.factory.impl;

import com.learning.abstractfactory.example1.Color;
import com.learning.abstractfactory.example1.Shape;
import com.learning.abstractfactory.example1.factory.AbstractFactory;
import com.learning.abstractfactory.example1.impl.color.Blue;
import com.learning.abstractfactory.example1.impl.color.Green;
import com.learning.abstractfactory.example1.impl.color.Red;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}
