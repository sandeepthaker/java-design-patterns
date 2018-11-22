package com.learning.factorypattern.example1.impl;

import com.learning.factorypattern.example1.DecodedImage;
import com.learning.factorypattern.example1.ImageReader;

public class JpegReader implements ImageReader {
    private DecodedImage decodedImage;

    public JpegReader() {
        System.out.println("Getting JpegReader");
    }

    @Override
    public DecodedImage getDecodeImage(String image) {
        decodedImage = new DecodedImage(image);
        return decodedImage;
    }
}