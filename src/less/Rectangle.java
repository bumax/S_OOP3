package less;

import less.base.Polygon;

public class Rectangle extends Polygon {

    public Rectangle(Double width, Double height) {
        super(4);
        if (width > 0.0 && height > 0.0 && width != height){
            setlSides(new Double[]{width, height, width, height});
        }
        else
            System.out.println("Это не прямоугольник или стороны неверны!"); ;

    }

    public Rectangle(Double width, Double height, Boolean ignore) {
        super(4);
        if (width > 0.0 && height > 0.0){
            setlSides(new Double[]{width, height, width, height});
        }
        else
            System.out.println("Стороны неверны!"); ;
    }

    @Override
    public Double getArea() {
        return getlSides()[0] * getlSides()[1];
    }
}
