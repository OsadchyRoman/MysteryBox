package org.company.service;

import org.company.bean.Shape;
import org.company.bean.ShapeType;

public interface ICreatorShape {
    Shape metalShape(ShapeType shapeType, double ... values);
    Shape paperShape(ShapeType shapeType, double ... values);
}
