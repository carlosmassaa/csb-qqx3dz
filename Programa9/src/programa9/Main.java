


package programa9;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        float pi = (float) 3.14159;
        float radio;
       
        

        System.out.println("Ingrese el radio del circulo ");
        Scanner sc = new Scanner(System.in);
        
        radio = sc.nextInt();        
        float diametro= 2* radio;
        float circunferencia= 2*pi*radio;
	double radioelevado = Math.pow(radio, 2);
        float area = (float) (pi*radioelevado);
        
        
        
        System.out.println("El diametro es" + diametro );
        
        System.out.println("La circunferencia es " + circunferencia);
        
        System.out.println("El area es " + area );
        
        
    }
    
}
