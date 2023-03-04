package com.diegofula.ejercicio17;

//  importamos la libreria Scanner y math
import java.util.Scanner;
import java.lang.Math;

public class ejercicio17 {

    public static void main(String[] args) {
        //  Declaramos el Scanner con la variable scan
        Scanner scan = new Scanner(System.in);
        
        //  El usuario digita el radio de la circunfencia
        System.out.println("Digite el radio de la circunferencia");
        double r = scan.nextInt();
        
        //  usando la libreria math encontramos pi y lo alojamos en una variable para facilitar la escritura
        double pi = Math.PI;
        //  Para el area usamos math.pow que nos deja encontrar la potencia, el area se alla con la ecuacion => pi x r^2
        double area = pi * (Math.pow(r, 2));
        //  Para la longitud usamos la ecuacion => 2 x pi x r
        double longc = 2 * pi * r;
        
        System.out.println("El area de la circunferencia es de = " + area);
        System.out.println("La longitud de la circuferncia es de = " + longc);
    }
    
}
