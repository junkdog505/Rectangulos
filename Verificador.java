public class Verificador extends Coordenada {
    public static boolean disjoint(Rectangulo r1, Rectangulo r2){
        Coordenada a = r1.getEsquina1();
        Coordenada b = r1.getEsquina2();
        Coordenada c = r2.getEsquina1();
        Coordenada d = r2.getEsquina2();
        double d1x1 = a.getX();
        double d1y1 = a.getY();
        double d1x2 = b.getX();
        double d1y2 = b.getY();

        double d2x1 = c.getX();
        double d2y1 = c.getY();
        double d2x2 = d.getX();
        double d2y2 = d.getY();
        if((d1y1 > d2y1 && d1y1 > d2y2) && (d1y2 > d2y1 && d1y2 > d2y2)){
            return true;
        }else if((d1y1 < d2y1 && d1y1 < d2y2) && (d1y2 < d2y1 && d1y2 < d2y2)){
            return true;
        }else if((d1x1 > d2x1 && d1x1 > d2x2) && (d1x2 > d2x1 && d1x2 > d2x2)){
            return true;
        }else return (d1x1 < d2x1 && d1x1 < d2x2) && (d1x2 < d2x1 && d1x2 < d2x2);
    }
    public static boolean overlap(Rectangulo r1, Rectangulo r2){
        Coordenada a = r1.getEsquina1();
        Coordenada b = r2.getEsquina2();
        Coordenada c = r1.getEsquina1();
        Coordenada d = r2.getEsquina2();
        double o1x1 = a.getX();
        double o1y1 = a.getY();
        double o1x2 = b.getX();
        double o1y2 = b.getY();

        double o2x1 = c.getX();
        double o2y1 = c.getY();
        double o2x2 = d.getX();
        double o2y2 = d.getY();
        if (o1x1 < o2x2 && o1x2 > o2x1 && o1y1 > o2y2 && o1y2 < o2y1){
            return true;
        }else{
            return false;
        }
    }
    public static boolean touch(Rectangulo r1, Rectangulo r2){
        Coordenada a = r1.getEsquina1();
        Coordenada b = r2.getEsquina2();
        Coordenada c = r1.getEsquina1();
        Coordenada d = r2.getEsquina2();
        double t1x1 = a.getX();
        double t1y1 = a.getY();
        double t1x2 = b.getX();
        double t1y2 = b.getY();

        double t2x1 = c.getX();
        double t2y1 = c.getY();
        double t2x2 = d.getX();
        double t2y2 = d.getY();

        if(t1y1 >= t2x1 || t1x2 >= t2y2 || t1x1 <= t2y1 || t1y2 <= t2x2){
            return true;
        }else {
            return false;
        }
    }
}
