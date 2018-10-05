package org.company.service;

import org.company.bean.paints.Paint;
import org.company.bean.shape.Shape;
import org.company.bean.sheet.Matirial;
import org.company.bean.sheet.Sheet;

import java.util.HashMap;
import java.util.List;

public class Girl implements ICreatorShape {
    private HashMap<Matirial, Sheet> sheets;
    private List<Paint> paints;

    public Girl(HashMap<Matirial, Sheet> sheets, List<Paint> paints) {
        this.sheets = sheets;
        this.paints = paints;
    }

    public HashMap<Matirial, Sheet> getSheets() {
        return sheets;
    }

    public void setSheets(HashMap<Matirial, Sheet> sheets) {
        this.sheets = sheets;
    }

    public List<Paint> getPaints() {
        return paints;
    }

    public void setPaints(List<Paint> paints) {
        this.paints = paints;
    }

    public Shape createPaperTriangle(double side){
        return sheets.get(Matirial.PAPER).createTriangle(side);
    }

    public Shape createMetalTriangle(double side){
        return  sheets.get(Matirial.METAL).createTriangle(side);
    }

    public Shape createPaperCircle(double radius) {
        return sheets.get(Matirial.PAPER).createCircle(radius);
    }

    public Shape createMetalCircle(double radius){
        return sheets.get(Matirial.METAL).createCircle(radius);
    }

    public Shape createPaperRectangle(double firstSide, double secondSide){
        return this.sheets.get(Matirial.PAPER).createRectangle(firstSide,secondSide);
    }

    public Shape createMetalRectangle(double firstSide, double secondSide){
        return sheets.get(Matirial.METAL).createRectangle(firstSide,secondSide);
    }

    public Shape createPaperSquare(double side){
        return sheets.get(Matirial.PAPER).createSquare(side);

    }
    public Shape createMetalSquare(double side){
        return sheets.get(Matirial.METAL).createSquare(side);
    }


    public Shape paintShape(int indexColor, Shape shape){
        shape.setColor(paints.get(indexColor).getColor());
        return shape;
    }
}
