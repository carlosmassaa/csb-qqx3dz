package programa6;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        
        System.out.println("Escribe un programa que calcule la suma de todos los números múltiplos de 5 comprendidos entre dos enteros positivos leídos por teclado. ");
        int numero1 = 0;
        int numero2 = 0;
        System.out.println("Ingrese el primer numero ");
        
        Scanner sc = new Scanner(System.in);
        
        numero1 = sc.nextInt();
        
       
        System.out.println("Ingrese el segundo numero ");
        
        Scanner sc1 = new Scanner(System.in);
        
        numero2 = sc1.nextInt();
        
         System.out.println("El numero son ");
        for (int i = numero1; i <= numero2; i++) {
            
            if(i%5==0){
                
               
                System.out.println(i + ",");
            }
            
        }
        
        
    }
    
    
    
}
