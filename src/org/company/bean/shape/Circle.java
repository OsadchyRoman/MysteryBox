package org.company.bean.shape;

public class Circle extends Shape {

    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(Shape shape){
        this.radius = shape.getRadiusForCircle();
        super.setMatirial(shape.getMatirial());
        if (!"White".equals(shape.getColor())){
            super.setColor(shape.getColor());
        }
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public double getSideForTriangle(){
        return this.radius * Math.sqrt(3);
    }
    @Override
    public double getSideForSquare(){
        return this.radius * 2 / Math.sqrt(2);
    }

    @Override
    public double[] getSidesForRectangle(){
        double[] sides = new double[2];
        sides[0] = this.radius * 2 / Math.sqrt(2);
        sides[1] = this.radius * 2 / Math.sqrt(2);
        return sides;
    }

    @Override
    public double getRadiusForCircle(){
        if (this.radius > 1.5)
            return this.radius - 1;
        return this.radius / 2;
    }

    @Override
    public String toString() {
        System.out.println("Name figure : Circle");
        System.out.println("Radius : " + this.radius);
        return super.toString();
    }
}
