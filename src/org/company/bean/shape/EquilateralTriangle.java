package org.company.bean.shape;

public class EquilateralTriangle extends Shape {
    public double side;


    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public EquilateralTriangle(Shape shape){
        this.side = shape.getSideForTriangle();
        super.setMatirial(shape.getMatirial());
        if (!"White".equals(shape.getColor())){
            super.setColor(shape.getColor());
        }
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        System.out.println("Name figure : Equilateral triangle");
        System.out.println("Side : " + side);
        return super.toString();
    }

    public double[] getSideForRectangle() {
        double[] sides = new double[2];
        sides[0] = this.side * Math.sqrt(3) / (2 + Math.sqrt(3));
        sides[1] = this.side * Math.sqrt(3) / (2 + Math.sqrt(3));
        return sides;
    }

    @Override
    public double getRadiusForCircle() {
        return this.side / (2 * Math.sqrt(3));
    }

    @Override
    public double getSideForTriangle() {
        if (this.side < 1.5)
            return side - 1;
        return side / 2;
    }

    @Override
    public double getSideForSquare() {
        return this.side * Math.sqrt(3) / (2 + Math.sqrt(3));
    }

    @Override
    public double[] getSidesForRectangle() {
        return new double[0];
    }

    @Override
    public double getArea(){
        return this.side * Math.sqrt(Math.pow(this.side, 2) - Math.pow(this.side / 2, 2) / 2);
    }
}
