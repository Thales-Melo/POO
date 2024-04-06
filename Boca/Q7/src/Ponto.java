public class Ponto {
    
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double distance(Ponto P_1, Ponto P_2) {
        double diff_X = Math.abs(P_2.getX() - P_1.getX());
        double diff_Y = Math.abs(P_2.getY() - P_1.getY());
        return Math.sqrt(Math.pow(diff_X, 2) + Math.pow(diff_Y, 2));
    }

}
