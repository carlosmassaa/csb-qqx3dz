package programa5;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {

        
        int numero1 = 0;

        System.out.println("Ingrese un numero entre 1 y 10 para ver la tabla de multiplicar");
        Scanner sc = new Scanner(System.in);
        
        numero1 = sc.nextInt();
        
        if(numero1>=1&&numero1<=10){
        
            for (int i = 1; i < 11; i++) {
                int resultado = i*numero1;
                System.out.println(i+" X " + numero1 + " = " + resultado  );
                
                
                
                
            }
                
            
        
        
        
        }
        else{
            
        
            System.out.println("ingreso un numero fueran de los permitidos");
            
        }
        
        
        
        
        
        
    }
    
}
