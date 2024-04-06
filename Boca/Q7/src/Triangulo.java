public class Triangulo {

    private Ponto points[];


    public void setPoints(Ponto[] points) {
        this.points = points;
    }
    

    // getters
    public double adjacent_Side() {
        return Ponto.distance(points[0], points[1]);
    }

    public double opposite_Side() {
        return Ponto.distance(points[1], points[2]);
    }
    
    public double hypotenuse() {
        return Ponto.distance(points[0], points[2]);
    }
    
    public Ponto[] getPoints() {
        return points;
    }


    public double perimeter() {
        return adjacent_Side()+opposite_Side()+hypotenuse();
    }


}
