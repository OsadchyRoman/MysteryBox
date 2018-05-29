package org.company;


import org.company.bean.*;
import org.company.service.Girl;
import org.company.service.ICreatorWithPaints;


public class Main {

    public static void main(String[] args) {
        Gitrl girl= new Girl();
        Shape shape = girl.paperShape(ShapeType.EQUILATERALTRIANGLE, 8);
        iCreatorWithColor.paintShape(Color.RED, shape);
        iCreatorWithColor.paintShape(Color.WHITE, shape);
        System.out.println(shape);


        System.out.println(shape.changeShape(ShapeType.SQUARE));

        /*System.out.println(girl.paperShape(ShapeType.RECTANGLE));
        System.out.println(girl.paperShape(ShapeType.RECTANGLE));
        System.out.println(girl.paperShape(ShapeType.EQUILATERALTRIANGLE));
        System.out.println(girl.paperShape(ShapeType.SQUARE));

        System.out.println(girl.metalShape(ShapeType.CIRCLE));
        System.out.println(girl.metalShape(ShapeType.RECTANGLE));
        System.out.println(girl.metalShape(ShapeType.EQUILATERALTRIANGLE));
        System.out.println(girl.metalShape(ShapeType.SQUARE));*/

    }
}
