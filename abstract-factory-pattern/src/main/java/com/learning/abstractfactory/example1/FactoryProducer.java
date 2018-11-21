package com.learning.abstractfactory.example1;

import com.learning.abstractfactory.example1.factory.AbstractFactory;
import com.learning.abstractfactory.example1.factory.impl.ColorFactory;
import com.learning.abstractfactory.example1.factory.impl.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}
