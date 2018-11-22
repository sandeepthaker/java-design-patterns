package com.learning.factorypattern.example1.impl;

import com.learning.factorypattern.example1.DecodedImage;
import com.learning.factorypattern.example1.ImageReader;

public class GifReader implements ImageReader {
    private DecodedImage decodedImage;

    public GifReader() {
        System.out.println("Getting GifReader");
    }

    @Override
    public DecodedImage getDecodeImage(String image) {
        decodedImage = new DecodedImage(image);
        return decodedImage;
    }
}
