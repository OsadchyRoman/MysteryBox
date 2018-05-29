package org.company.bean;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class EquilateralTriangle extends Shape{
    public double side;


    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public EquilateralTriangle(double[] values){
        this.side = values[0];
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

    @Override
    public Map<ShapeType, List<Double>> checkParametersFigure() {
        Map<ShapeType, List<Double>> map = new EnumMap<ShapeType, List<Double>>(ShapeType.class);

        //Side for square
        map.put(ShapeType.SQUARE, getSideForSquare());

        //Side for Circle
        map.put(ShapeType.CIRCLE, getRadiusForCircle());

        //Side for rectangle
        map.put(ShapeType.RECTANGLE, getSideForRectangle());

        return map;
    }

    private List<Double> getSideForRectangle() {
        List<Double> list = new ArrayList<>();
        list.add(this.side * Math.sqrt(3) / (2 + Math.sqrt(3)));
        list.add(this.side * Math.sqrt(3) / (2 + Math.sqrt(3)));
        return list;
    }

    private List<Double> getRadiusForCircle() {
        List<Double> list = new ArrayList<>();
        list.add(this.side / (2 * Math.sqrt(3)));
        return list;
    }

    private List<Double> getSideForSquare() {
        List<Double> list = new ArrayList<>();
        list.add(this.side * Math.sqrt(3) / (2 + Math.sqrt(3)));
        return list;
    }

    @Override
    public double getArea(){
        return this.side * Math.sqrt(Math.pow(this.side, 2) - Math.pow(this.side / 2, 2) / 2);
    }
}
