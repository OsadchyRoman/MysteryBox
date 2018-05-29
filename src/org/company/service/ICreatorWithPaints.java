package org.company.service;

import org.company.bean.Color;
import org.company.bean.Shape;

public interface ICreatorWithPaints extends ICreatorShape {
    void paintShape(Color color, Shape shape);
}
