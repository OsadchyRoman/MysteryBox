package org.company.bean;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(double[] doubles){
        this.side = doubles[0];
    }

    @Override
    public Map<ShapeType, List<Double>> checkParametersFigure() {
        Map<ShapeType, List<Double>> map = new EnumMap<ShapeType, List<Double>>(ShapeType.class);

        //Side for triangle
        map.put(ShapeType.EQUILATERALTRIANGLE, getSideForTriangle());

        //Side for Circle
        map.put(ShapeType.CIRCLE, getRadiusForCircle());

        //Side for rectangle
        map.put(ShapeType.RECTANGLE, getSideForRectangle());

        return map;
    }

    private List<Double> getSideForTriangle(){
        List<Double> list = new ArrayList<>();
        list.add(this.side);
        return list;
    }

    private List<Double> getSideForRectangle(){
        List<Double> list = new ArrayList<>();
        list.add(this.side/2);
        list.add(this.side);
        return list;
    }

    private List<Double> getRadiusForCircle() {
        List<Double> list = new ArrayList<>();
        list.add(this.side/2);
        return list;
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
