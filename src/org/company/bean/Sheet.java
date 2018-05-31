package org.company.bean;

public abstract class Sheet {

    public Shape createShape(ShapeType shapeType, double ... values) {
        Shape shape = shapeType.cut(values);
        shape.setMatirial(getMatirial());
        return shape;
    }


    public abstract Matirial getMatirial();
}
