package less;

import less.base.Polygon;

public class Triangle extends Polygon {
    public Triangle(Double a, Double b, Double c) {
        super(3);
        if (a > 0.0 && b > 0.0 && c > 0.0 ){
            setlSides(new Double[]{a, b, c});
        }
        else
            System.out.println("Неправильные стороны!");
    }

    @Override
    public Double getArea() {
        Double p = super.getPeremetr() / 2;
        // Формула Герона
        return Math.sqrt(Math.abs(p * (p - getlSides()[0]) * (p - getlSides()[1]) * (p - getlSides()[2])));
    }
}
