package org.company.collection;

import org.company.bean.shape.Shape;

import java.util.List;

public class Box {
    private List<Shape> list;

    public Box(List<Shape> list) {
        this.list = list;
    }

    public void put(Shape shape){
        this.list.add(shape);
    }

    public Shape getLastShape(){
        Shape shape = list.get(list.size()-1);
        this.list.remove(list.size()-1);
        return shape;
    }

    public List<Shape> getList() {
        return list;
    }

    public void setList(List<Shape> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        for (Shape shape : list){
            shape.toString();
        }
        return "";
    }
}
