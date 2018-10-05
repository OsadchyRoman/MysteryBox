package org.company;

import org.company.bean.paints.ColorPallete;
import org.company.bean.paints.Paint;
import org.company.bean.shape.Circle;
import org.company.bean.shape.Rectangle;
import org.company.bean.shape.Shape;
import org.company.bean.shape.Square;
import org.company.bean.sheet.Matirial;
import org.company.bean.sheet.MetalSheet;
import org.company.bean.sheet.PaperSheet;
import org.company.bean.sheet.Sheet;
import org.company.collection.Box;
import org.company.service.Girl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        HashMap<Matirial, Sheet> sheets = new HashMap<>();
        sheets.put(Matirial.PAPER, new PaperSheet());
        sheets.put(Matirial.METAL, new MetalSheet());
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Red");
        list.add("Yellow");
        ColorPallete colorPallete = new ColorPallete(list);
        ArrayList<Paint> paints = new ArrayList<>();
        paints.add(new Paint((String)colorPallete.getColor().get(0)));
        paints.add(new Paint((String)colorPallete.getColor().get(1)));
        paints.add(new Paint((String)colorPallete.getColor().get(2)));
        Girl girl = new Girl(sheets, paints);
        Box box = new Box(new ArrayList<>());



        Shape square = girl.createMetalSquare(5);
        box.put(square);
        Shape rectangle = girl.createPaperRectangle(10,5);
        box.put(rectangle);
        Shape shape = new Circle(box.getLastShape());
        box.put(shape);
        box.put(girl.paintShape(1, box.getLastShape()));

        box.toString();


        /*
        System.out.println(girl.paperShape(ShapeType.RECTANGLE));
        System.out.println(girl.paperShape(ShapeType.RECTANGLE));
        System.out.println(girl.paperShape(ShapeType.EQUILATERALTRIANGLE));
        System.out.println(girl.paperShape(ShapeType.SQUARE));

        System.out.println(girl.metalShape(ShapeType.CIRCLE));
        System.out.println(girl.metalShape(ShapeType.RECTANGLE));
        System.out.println(girl.metalShape(ShapeType.EQUILATERALTRIANGLE));
        System.out.println(girl.metalShape(ShapeType.SQUARE));
        */

    }
}
