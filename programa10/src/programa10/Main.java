package programa10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Cuantos empleados desea ingresar");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> empleado = new ArrayList<String>();
        ArrayList<Integer> cuotanormal = new ArrayList<Integer>();
        ArrayList<Integer> horas = new ArrayList<Integer>();
        int cantemp = sc.nextInt();
        for (int i = 1; i <= cantemp; i++) {

            System.out.println("Ingrese empleado " + i);
            Scanner sc1 = new Scanner(System.in);
            String var = sc1.nextLine();
            empleado.add(var);

            System.out.println("Ingrese cuota normal " + i);

            Scanner sc2 = new Scanner(System.in);
            int var2 = sc2.nextInt();
            cuotanormal.add(var2);

            System.out.println("Ingrese horas trabajadas " + i);

            Scanner sc3 = new Scanner(System.in);
            int var3 = sc2.nextInt();
            horas.add(var3);

        }

        for (int j = 0; j < cantemp; j++) {

            if (horas.get(j) > 40) {
                int cuarenta = 40 * cuotanormal.get(j);
                int variable = horas.get(j) - 40;

                int auxiliar = (int) (variable * (cuotanormal.get(j) * 1.5));

                variable = auxiliar + cuarenta;

                System.out.println("Al empleado " + empleado.get(j) + " se le debe pagar $" + variable);

            } else if (horas.get(j) <= 40) {
         
                int totalapagar = horas.get(j) * cuotanormal.get(j);

                System.out.println("Al empleado " + empleado.get(j) + " se le debe pagar $" + totalapagar);

            }

        }

    }

}
