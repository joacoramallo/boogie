/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aadesarrollo;
import java.util.Scanner;   
/**
 *
 * @author pc13
 */
public class Ramallo_Jota21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int a = 0;
    System.out.println("Ingrese un numero maximo:");
    a = entrada.nextInt();
    for (int num=1; num<=a; num++){
        if (num%6==0){
            System.out.println(num);
    }
}
    }
    
}
