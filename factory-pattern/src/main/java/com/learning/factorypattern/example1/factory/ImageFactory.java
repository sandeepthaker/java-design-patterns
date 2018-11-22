package com.learning.factorypattern.example1.factory;

import com.learning.factorypattern.example1.ImageReader;
import com.learning.factorypattern.example1.impl.GifReader;
import com.learning.factorypattern.example1.impl.JpegReader;

public class ImageFactory {

    public static ImageReader getImageReader(String format){
            ImageReader reader = null;
            if(format!=null) {
                if (format.equals("gif")) {
                    reader = new GifReader();
                }
                else if (format.equals("jpeg")) {
                    reader = new JpegReader();
                }
            }
            return reader;
    }
}
