package less.base;

public abstract class Polygon extends Figure implements Peremetr {
    public Polygon(Integer nSides) {
        this.nSides = nSides;
    }

    public Integer getnSides() {
        return nSides;
    }

    public void setnSides(Integer nSides) {
        this.nSides = nSides;
    }

    public Double[] getlSides() {
        return lSides;
    }

    public void setlSides(Double[] lSides) {
        for (int i = 0; i < lSides.length; i++) {
            this.lSides[i] = lSides[i];
        }
    }

    private Integer nSides;
    private Double[] lSides = new Double[100];

    @Override
    public Double getPeremetr() {
        Double res = 0.0;
        for (Double side : lSides) {
            if (side != null)
                res += side;
        }
        return res;
    }

}
