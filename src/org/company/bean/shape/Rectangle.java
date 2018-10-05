package org.company.bean.shape;

public class Rectangle extends Shape {

    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Rectangle (Shape shape){
        double[] sides = shape.getSidesForRectangle();
        try {
            this.firstSide = sides[0];
            this.secondSide = sides[1];
        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        super.setMatirial(shape.getMatirial());
        if (!"White".equals(shape.getColor())){
            super.setColor(shape.getColor());
        }
    }

    public Rectangle(double[] doubles){
        try {
            this.secondSide = doubles[0];
            this.firstSide = doubles[1];
        }
        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }


    public double getSideForSquare() {
        return getMinSide();
    }

    @Override
    public double[] getSidesForRectangle() {
        double[] sides = new double[2];
        if (this.firstSide < 1.5 && this.secondSide < 1.5) {
            sides[0] = this.firstSide - 1;
            sides[1] = this.secondSide - 1;
        } else {
            sides[0] = this.secondSide / 2;
            sides[1] = this.secondSide / 2;
        }
        return sides;
    }

    public double getRadiusForCircle() {
        return getMinSide() / 2;
    }

    public double getSideForTriangle(){
        return getMaxSide();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    private Double getMinSide() {
        return firstSide < secondSide ? firstSide : secondSide;
    }

    private Double getMaxSide() {
        return firstSide > secondSide ? firstSide : secondSide;
    }

    @Override
    public String toString() {
        System.out.println("Name figure : Rectangle");
        System.out.println("Sides : " + this.secondSide + " " + this.firstSide);
        return super.toString();
    }
}
