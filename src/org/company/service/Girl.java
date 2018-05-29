package org.company.service;

import org.company.bean.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Girl implements ICreatorShape, IPainter{
    private HashMap<Matirial, Sheet> sheets;
    private List<Paint> paints;

    public Girl(){
        sheets = new HashMap<>();
        sheets.put(Matirial.PAPER, new PaperSheet());
        sheets.put(Matirial.METAL, new MetalSheet());
        paints = new ArrayList<>();
        paints.add(new Paint(Color.BLUE));
        paints.add(new Paint(Color.RED));
        paints.add(new Paint(Color.YELLOW));
    }

    public Shape metalShape(ShapeType shapeType, double ... values){
        return sheets.get(Matirial.METAL).createShape(shapeType, values);
    }

    public Shape paperShape(ShapeType shapeType, double ... values){
        return sheets.get(Matirial.PAPER).createShape(shapeType, values);
    }

    public void paintShape(Color color, Shape shape){
        for(Paint paint : paints){
            if (paint.getColor() == color){
                shape.setColor(paint.getColor());
            }
        }

    }


}
