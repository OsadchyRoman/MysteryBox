package org.company.collection;

import org.company.bean.Shape;

import java.util.ArrayList;
import java.util.Arrays;

public class Box {

    private Shape[] shapes;
    private ArrayList<String> arrayList;
    private int index;
    private static final int DEFAULT_CAPACITY = 10;

    public Box(){
        index = 0;
        shapes = new Shape[DEFAULT_CAPACITY];
        arrayList = new ArrayList<>();
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    protected void increaseCapacity(){
        if (DEFAULT_CAPACITY == shapes.length)
            shapes = Arrays.copyOf(shapes, (int)(DEFAULT_CAPACITY*1.5));
    }

    public void add(Shape shape){
        increaseCapacity();
        shapes[index++] = shape;
    }

    private void addInformation(String string) {
        arrayList.add(string);
    }

    public void printShapes() {
        int n = getIndex();
        for (int i = 0; i < n; i++) {
            shapes[i].toString();
        }
    }

    public void printInformation(){
        for (int i = 0; i < getIndex(); i++) {
            System.out.println(arrayList.get(i));
        }

    }

}
