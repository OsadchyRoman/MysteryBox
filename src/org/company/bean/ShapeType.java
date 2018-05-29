package org.company.bean;

import java.util.List;

public enum ShapeType {
    CIRCLE{
        @Override
        public Shape cut(double ... values){
            return new Circle(values[0]);
        }

        @Override
        public Shape cutOtherShape(double[] values) {
            return new Circle(values);
        }

    },
    RECTANGLE{
        @Override
        public Shape cut(double ... values){
            return new Rectangle(values[0], values[1]);
        }

        @Override
        public Shape cutOtherShape(double[] values) {
            return new Rectangle(values);
        }


    },
    SQUARE{
        @Override
        public Square cut(double ... values){
            return new Square(values[0]);
        }

        @Override
        public Shape cutOtherShape(double[] values) {
            return new Square(values);
        }


    },
    EQUILATERALTRIANGLE{
        @Override
        public EquilateralTriangle cut(double ... values){
            return new EquilateralTriangle(values[0]);
        }

        @Override
        public Shape cutOtherShape(double[] values) {
            return new EquilateralTriangle(values);
        }


    };

    public abstract Shape cut(double ... values);
    public abstract Shape cutOtherShape(double[] values);

}
