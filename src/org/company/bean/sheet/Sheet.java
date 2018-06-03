package org.company.bean.sheet;

import org.company.bean.shape.Square;
import org.company.bean.shape.EquilateralTriangle;
import org.company.bean.shape.Rectangle;
import org.company.bean.shape.Shape;

public abstract class Sheet {

    public Shape createSquare(double side){
        Shape shape = new Square(side);
        shape.setMatirial(getMatirial());
        return shape;
    }

    public Shape createTriangle(double side){
        Shape shape = new EquilateralTriangle(side);
        shape.setMatirial(getMatirial());
        return shape;
    }

    public Shape createCircle(double radius){
        Shape shape = new EquilateralTriangle(radius);
        shape.setMatirial(getMatirial());
        return shape;
    }

    public Shape createRectangle(double firstSide, double secondSide){
        Shape shape = new Rectangle(firstSide, secondSide);
        shape.setMatirial(getMatirial());
        return shape;
    }

    public abstract Matirial getMatirial();
}
