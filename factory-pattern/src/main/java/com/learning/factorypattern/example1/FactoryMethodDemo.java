package com.learning.factorypattern.example1;

import com.learning.factorypattern.example1.factory.ImageFactory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        String gifImage="1.gif";
        String jpegImage="1.jpeg";

        ImageReader gifReader = ImageFactory.getImageReader("gif");
        decodedImage = gifReader.getDecodeImage(gifImage);
        System.out.println(decodedImage);

        ImageReader jpegReader = ImageFactory.getImageReader("jpeg");
        decodedImage=jpegReader.getDecodeImage(jpegImage);
        System.out.println(decodedImage);
    }
}
