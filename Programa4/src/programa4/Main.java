package programa4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero1 = 0;

        System.out.println("Ingrese un numero a factorear mayor a 0");

        Scanner sc = new Scanner(System.in);
        
        numero1 = sc.nextInt();
        ArrayList<Integer> guardar = new ArrayList();

        if (numero1 >= 0) {


  
            for (int i = 1; i <=numero1; i++) {
               
                if (numero1 % i == 0) {
                    guardar.add(i);
                }
            }
  
        }
      
        for (int i = 0; i < guardar.size(); i++) {

        }
        System.out.println("Los divisores son: " + guardar);
       
    }

}
