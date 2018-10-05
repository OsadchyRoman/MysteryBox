package org.company.bean.shape;

import org.company.bean.sheet.Matirial;

public abstract class Shape {

    private Matirial matirial;
    private String color = "White";


    @Override
    public String toString() {
        System.out.println("Matirial : " + matirial);
        System.out.println("Color : " + color);
        return "";
    }

    public void setColor(String color) {
        if(getMatirial() != Matirial.METAL && "White".equals(this.color)) {
            this.color = color;
        }
    }

    public String getColor() {
        return color;
    }

    public Matirial getMatirial() {
        return matirial;
    }

    public void setMatirial(Matirial matirial) {
        this.matirial = matirial;
    }

    public abstract double getRadiusForCircle();
    public abstract double getSideForTriangle();
    public abstract double getSideForSquare();
    public abstract double[] getSidesForRectangle();
    public abstract double getArea();
}
