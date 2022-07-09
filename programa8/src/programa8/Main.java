
    package programa8;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        
                int numero1 = 0;
                int numero2 = 0;

        System.out.println("Ingrese dos numeros positivos para ver la suma entre ellos");
        System.out.println("Ingrese el primer numero ");
        Scanner sc = new Scanner(System.in);
        
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        Scanner sc1 = new Scanner(System.in);
        
        numero2 = sc1.nextInt();
        int suma = 0;
        if(numero1>=0&&numero2>=0){
        numero1 = numero1+ 1;
        
            for (int i = numero1; i < numero2; i++) {
               
              suma = suma + i;
                
                
            }
              System.out.println("La suma de los numeros entre los numeros ingresado es " + suma);
    }
    
}
}
