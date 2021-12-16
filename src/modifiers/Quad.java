package modifiers;

import util.MathUtils;

public class Quad extends Shape {
    private int side;
    private int area;

    public Quad(int side) {
        setName("Quad");
        this.side = side;

        calcArea();
    }

    private void calcArea() {
        area = MathUtils.calcQuadArea(side);
    }

    public int getArea() {
        return area;
    }

    public void setSide(int side) {
        this.side = side;

        calcArea();
    }

    @Override
    public String toString() {
        return "Quad{" +
                "name=" + getName() +
                ", side=" + side +
                ", area=" + area +
                '}';
    }
}
