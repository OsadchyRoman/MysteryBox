package org.company.bean;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Circle extends Shape {

    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double[] values){
        this.radius = values[0];
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public Map<ShapeType, List<Double>> checkParametersFigure(){
        Map<ShapeType, List<Double>> map = new EnumMap<ShapeType, List<Double>>(ShapeType.class);

        //Side for triangle
        map.put(ShapeType.EQUILATERALTRIANGLE, getSideForTriangle());

        //Side for rectangle
        map.put(ShapeType.RECTANGLE, getSideForRectangle());

        //Side for square
        map.put(ShapeType.SQUARE, getSideForSquare());

        return map;
    }

    private List<Double> getSideForTriangle(){
        List<Double> list = new ArrayList<>();
        list.add(this.radius * Math.sqrt(3));
        return list;
    }

    private List<Double> getSideForRectangle(){
        List<Double> list = new ArrayList<>();
        list.add(this.radius * 2 / Math.sqrt(2));
        list.add(this.radius * 2 / Math.sqrt(2));
        return list;
    }

    private List<Double> getSideForSquare(){
        List<Double> list = new ArrayList<>();
        list.add(this.radius * 2 / Math.sqrt(2));
        return list;
    }


    @Override
    public String toString() {
        System.out.println("Name figure : Circle");
        System.out.println("Radius : " + this.radius);
        return super.toString();
    }

}
