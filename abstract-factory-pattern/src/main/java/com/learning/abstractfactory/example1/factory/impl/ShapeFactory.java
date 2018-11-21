package com.learning.abstractfactory.example1.factory.impl;

import com.learning.abstractfactory.example1.Color;
import com.learning.abstractfactory.example1.Shape;
import com.learning.abstractfactory.example1.factory.AbstractFactory;
import com.learning.abstractfactory.example1.impl.shape.Circle;
import com.learning.abstractfactory.example1.impl.shape.Rectangle;
import com.learning.abstractfactory.example1.impl.shape.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
