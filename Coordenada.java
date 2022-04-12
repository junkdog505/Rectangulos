import java.util.*;

public class Coordenada {
    Scanner entrada = new Scanner(System.in);
    private double x;
    private double y;
    public Coordenada(){this(0,0);}
    public Coordenada(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c){this(c.x, c.y);}

    public double getX() {return x;}

    public void setX(double x) {this.x = x;}

    public double getY() {return y;}

    public void setY(double y) {this.y = y;}

    public double distancia (Coordenada c){
        return Math.sqrt(Math.pow(this.x - c.x,2) + Math.pow(this.y - c.y,2));
    }
    public static double distancia(Coordenada c1, Coordenada c2){
        return Math.sqrt(Math.pow(c1.x - c2.x,2) + Math.pow(c2.y - c1.y,2));
    }
    @Override
    public String toString(){
        return "[" + this.x + ", " +this.y+ "]";
    }
}
