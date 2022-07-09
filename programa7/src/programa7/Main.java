package programa7;

import java.util.Random;
import java.util.Scanner;


public class Main {


    
    public static void main(String[] args) {
        System.out.println("ADIVINE EL NUMERO ");
        Random random = new Random();
        
        int max=100;
        int min=0;
        int value = random.nextInt(max + min) + min;
        int adivinarnum;
        System.out.println("Ingrese un numero");
        Scanner sc1 = new Scanner(System.in);
        adivinarnum=sc1.nextInt();

        while(adivinarnum!=value){
    
        if(adivinarnum>value){
        
            System.out.println("El numero ingresado es mayor");
        }else{
        
            System.out.println("El numero ingresado es menor");
            
        }
    
        System.out.println("Ingrese un numero");
        Scanner sc2 = new Scanner(System.in);
        adivinarnum=sc2.nextInt();

    
    
    
    }
        System.out.println("FELCITACIONES adivinaste el numero");
    }
    
}
