package factoryPattern;

public class PolygonFactory {

    public Polygon getPolygon(int numsides) {
        if(numsides ==  3) {
            return new Triangle();
        }

        if(numsides ==  4) {
            return new Square();
        }

        if(numsides ==  5) {
            return new Pentagon();
        }
        if(numsides ==  7) {
            return new Heptagon();
        }

        if(numsides ==  7) {
            return new Octagon();
        }

        return null;
    }
}
