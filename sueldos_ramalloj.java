/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ramallo
 */
public class sueldos_ramalloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int horas;
        int costo;
        int mes;
        int año;
        System.out.println("Ingrese las horas trabajadas y el costo por hora:");
        horas= entrada.nextInt();
        costo= entrada.nextInt();
        mes= horas*costo;
        System.out.println("El sueldo por mes es de "+mes);
        año= mes*12;
        System.out.println("El sueldo por año es de "+año);
    }
    
}
