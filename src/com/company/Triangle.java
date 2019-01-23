package com.company;

public class Triangle {

    private int triHeight;
    private int triBase;

    public void setHeight (int triObjectHeight) {
        triHeight = triObjectHeight;
    }

    public int getHeight() {
        return triHeight;
    }

    public void setTriBase (int triObjectWidth) {
        triBase = triObjectWidth;
    }

    public int getTriBase() {
        return triBase;
    }

    public int getArea() {
        return ((triHeight * triBase) / 2);
    }

    public int getCircumference() {
        return ((triHeight*2) + (triBase*2));
    }
}
