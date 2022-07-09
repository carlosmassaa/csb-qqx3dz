package ejercicion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Integer> guardar = new ArrayList();
        int suma = 0;
        for (int i = 1; i < 4; i++) {
        System.out.println("Ingrese el "+ i+" numero ");
        Scanner sc = new Scanner(System.in);
        guardar.add(sc.nextInt());
        
        }

        for (int i = 1; i < guardar.size(); i++) {
          
            suma = suma + guardar.get(i);
            
        }
  

        float promedio = suma / 3;
        int numerosdist = 0;
        if ( guardar.get(0)!= guardar.get(1)) {

            numerosdist = numerosdist + 1;

        }
        if (guardar.get(1) != guardar.get(2)) {

            numerosdist = numerosdist + 1;

        }
        if (guardar.get(0) != guardar.get(2)) {

            numerosdist = numerosdist + 1;

        }
        int mayor = 0;

        if (guardar.get(0) > guardar.get(1)) {
            mayor = guardar.get(0);
        } else {
            mayor = guardar.get(1);
        }
        if (mayor > guardar.get(2)) {
            mayor = mayor;
        } else {
            mayor = guardar.get(2);
            
        };

        int menor = 0;

        if (guardar.get(0) < guardar.get(1)) {
            menor = guardar.get(0);
        } else {
            menor = guardar.get(1);
        }
        if (menor < guardar.get(2)) {
            menor = menor;
        } else {
            menor = guardar.get(2);
        };       
        
        
        int productomaspormenos = mayor * menor;

        System.out.print("La suma es: ");
        System.out.println(suma);
        System.out.print("El promedio es: ");
        System.out.println(promedio);
        System.out.print("Cantidad de numero distintos ");
        System.out.println(numerosdist);
        System.out.print("el mayor ");
        System.out.println(mayor);
        System.out.print("el menor ");
        System.out.println(menor);
        System.out.print("producto del mayor y el menor ");
        System.out.println(productomaspormenos);
        System.out.print("¿El Resultado producto del mayor y el menor es divisble por 3? ");
        int res = productomaspormenos % 3;
        if (res == 0) {
            System.out.println("si es divisible");
        } else if (res != 0) {
            System.out.println("no es es divisible");
        };

    }
}
