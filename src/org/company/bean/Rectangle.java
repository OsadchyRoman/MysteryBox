package org.company.bean;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Rectangle extends Shape {

    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Rectangle(double[] doubles){
        this.secondSide = doubles[0];
        this.firstSide = doubles[1];
    }

    @Override
    public Map<ShapeType, List<Double>> checkParametersFigure() {
        Map<ShapeType, List<Double>> map = new EnumMap<ShapeType, List<Double>>(ShapeType.class);

        //Side for triangle
        map.put(ShapeType.EQUILATERALTRIANGLE, getSideForTriangle());

        //Side for Circle
        map.put(ShapeType.CIRCLE, getRadiusForCircle());

        //Side for square
        map.put(ShapeType.SQUARE, getSideForSquare());

        return map;
    }

    private List<Double> getSideForSquare() {
        List<Double> list = new ArrayList<>();
        list.add(getMinSide());
        return list;
    }

    private List<Double> getRadiusForCircle() {
        List<Double> list = new ArrayList<>();
        list.add(getMinSide()/2);
        return list;
    }

    private List<Double> getSideForTriangle(){
        List<Double> list = new ArrayList<>();
        list.add(getMaxSide());
        return list;
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
