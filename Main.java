import java.util.*;
public class Main extends Coordenada {
    public static void main(String[] args) {
        double dato;
        Scanner entrada = new Scanner(System.in);
        //Rectangulo donde no se tocan.
        Coordenada c1 = new Coordenada(); // 9,5
        Coordenada c2 = new Coordenada(); // 4,0
        Coordenada c3 = new Coordenada(); // 5,11
        Coordenada c4 = new Coordenada(); // 0,6

        Coordenada c5 = new Coordenada(); // 7.6, 2.2
        Coordenada c6 = new Coordenada(); // 1.5, 0.3
        Coordenada c7 = new Coordenada(); // 9.4, -2.5
        Coordenada c8 = new Coordenada(); // 4.0, 4.2

        Coordenada c9 = new Coordenada(); // 33.3, 3.6
        Coordenada c10 = new Coordenada(); // 20.5, -1.1
        Coordenada c11 = new Coordenada(); // 20.5, 8.6
        Coordenada c12 = new Coordenada(); // 10.3, -5.2

        Rectangulo A = new Rectangulo(c1,c2);
        Rectangulo B = new Rectangulo(c3,c4);
        Rectangulo C = new Rectangulo(c5,c6);
        Rectangulo D = new Rectangulo(c7,c8);
        Rectangulo E = new Rectangulo(c9, c10);
        Rectangulo F = new Rectangulo(c11, c12);
        Coordenada [] coordenadas = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12};
        Rectangulo [] rectangulos = {A,B,C,D,E,F};

        System.out.println("Rectangulo A y B = verificación disjunto\nRectangulo C y D = verificación sobreponer\nRectangulo E y F = verificación juntos ");
        for (Coordenada n : coordenadas ){
            System.out.println("-----------------------------------");
            System.out.print("Ingrese el valor de X: ");
            dato = entrada.nextDouble();
            n.setY(dato);
            System.out.print("Ingrese el valor de y: ");
            dato = entrada.nextDouble();
            n.setX(dato);
        }
        for (Rectangulo p : rectangulos){
            System.out.println("-----------------------------------");
            System.out.println("El valor de Esquina1: " + p.getEsquina1());
            System.out.println("El valor de Esquina2: " + p.getEsquina2());
        }

        System.out.println("-----------------------------------");
        System.out.println("Validación de los rectangulos A y B");
        if(Verificador.disjoint(A,B)){
            System.out.println("Los rectuangulos son disjuntos.");
        } else {
            System.out.println("Los rectangulos no son disjuntos.");
        }

        System.out.println("-----------------------------------");
        System.out.println("Validación de los rectangulos C y D");
        if(Verificador.overlap(C,D)) {
            System.out.println("Los rectangulos se sobreponen");
        }else{
            System.out.println("Los rectangulos no se sobreponen");
        }

        System.out.println("-----------------------------------");
        if(Verificador.touch(E,F)){
            System.out.println("Validación de los rectangulos E y F");
            System.out.println("Los rectangulos se juntan.");
        }else{
            System.out.println("Los rectangulos no se juntan.");
        }
    }
}
