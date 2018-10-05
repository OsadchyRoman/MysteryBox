package org.company.bean.shape;


public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(Shape shape){
        this.side = shape.getSideForSquare();
        super.setMatirial(shape.getMatirial());
        if (!"White".equals(shape.getColor())){
            super.setColor(shape.getColor());
        }
    }

    @Override
    public double getSideForTriangle(){
        return this.side;
    }

    @Override
    public double getSideForSquare() {
        return this.side - 1;
    }

    @Override
    public double[] getSidesForRectangle() {
        double[] sides = new double[2];
        sides[0] = this.side/2;
        sides[1] = this.side;
        return sides;
    }

    @Override
    public double getRadiusForCircle(){
        return side/2;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }


    @Override
    public String toString() {
        System.out.println("Name figure : Square");
        System.out.println("Side : " + this.side);
        return super.toString();
    }
}
