package programan3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero1 = 5;

        System.out.println("Ingrese un numero a factorear mayor a 0(Ingresando el 0 finaliza el programa)");

        Scanner sc = new Scanner(System.in);
   
        numero1 = sc.nextInt();
        while(numero1!=0){
        if (numero1 > 0) {
            int factorial = 1;
            int guardnum = numero1;
            for (int i = 0; i < guardnum; i++) {

                factorial = factorial * numero1;

                numero1 = numero1 - 1;

            }

            System.out.println("El resultado del factorial es " + factorial);

        } else {

            System.out.println("Ah ingresado un numero menor a 0");

        }
        
         System.out.println("si quiere saliringrese 0");
       numero1=sc.nextInt();
        
    }
       
        }
    }

