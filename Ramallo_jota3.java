/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramallo_jota;
import java.util.Scanner;
/**
 *
 * @author pc02
 */
public class Ramallo_jota3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int horas;
        int costo;
        int mes;
        int año;
        System.out.println("ingrese horas trabajadas y el costo");
        horas= entrada.nextInt();
        costo= entrada.nextInt();
        mes= horas*costo;
        System.out.println("el sueldo por meses "+mes);
        año= mes*12;
        System.out.println("el sueldo por año es "+año);
    }
    
}
