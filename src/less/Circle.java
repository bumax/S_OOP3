package less;

import less.base.*;

public class Circle extends Figure implements CurvedLen {
    public Circle(Double radius) {
        if (radius > 0.0)
            this.radius = radius;
        else
            System.out.println("Нулевой радиус");
    }

    public Double radius;

    @Override
    public Double gelLen() {
        return 2.0 * Math.PI * radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }
}
