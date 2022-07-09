package programan2;

import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
        
   
        int año = 0;
  

        System.out.println("Ingrese un año ");

        Scanner sc = new Scanner(System.in);

        año = sc.nextInt();
        
        
         System.out.print("¿es bisiesto ? ");
       
        if (año % 4 == 0&&año % 100!=0||año % 400==0) {
            System.out.println("si es bisiesto");
            
        } else if (año % 4!= 0||año % 100==0&&año % 400!=0) {
            System.out.println("no es  bisiesto");
        };
        
        
        
    }
    
}

