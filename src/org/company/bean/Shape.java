package org.company.bean;


import java.util.List;
import java.util.Map;

public abstract class Shape {

    private Matirial matirial;
    private Color color = Color.WHITE;

    @Override
    public String toString() {
        System.out.println("Matirial : " + matirial);
        System.out.println("Color : " + color);
        return "";
    }

    public void setColor(Color color) {
        if(getMatirial() != Matirial.METAL && this.color == Color.WHITE) {
            this.color = color;
        }
    }

    public Matirial getMatirial() {
        return matirial;
    }

    public void setMatirial(Matirial matirial) {
        this.matirial = matirial;
    }

    public Shape changeShape(ShapeType shapeType){
        Map<ShapeType, List<Double>> map = checkParametersFigure();
        List<Double> list = map.get(shapeType);
        double[] doubles = new double[list.size()];
        for (int i = 0; i<list.size(); i++){
            doubles[i] = list.get(i);
        }
        Shape shape = shapeType.cutOtherShape(doubles);
        shape.setMatirial(matirial);
        return shape;
    }

    public abstract Map<ShapeType, List<Double>> checkParametersFigure();
    public abstract double getArea();
}
