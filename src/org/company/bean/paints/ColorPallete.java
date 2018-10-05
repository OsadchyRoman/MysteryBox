package org.company.bean.paints;

import java.util.List;

public class ColorPallete {
    private List<String> color;

    public ColorPallete(List<String> color) {
        this.color = color;
    }

    public List getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }
}
