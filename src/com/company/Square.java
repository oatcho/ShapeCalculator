package com.company;

public class Square {

    private int height;
    private int width;

    public void setHeight (int objectHeight) {
        height = objectHeight;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth (int objectWidth) {
        width = objectWidth;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return height * width;
    }

    public int getCircumference() {
        return ((height*2) + (width*2));
    }
}
