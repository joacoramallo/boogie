/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author pc02
 */
public class Ramallo_jota5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero;
    System.out.println("Introduzca un numero entero:");
    numero = entrada.nextInt();
            if (numero%10==0)
            System.out.println("Es múltiplo de 10");
        else 
            System.out.println("No es múltiplo de 10");
    }
    
}
