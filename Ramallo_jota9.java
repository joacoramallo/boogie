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
public class Ramallo_jota9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int N;
    System.out.println("Ingrese un numero y se ira contando del 1 al numero ingresado");
    N = entrada.nextInt();
    int i=1;
    while (i<=N){
    System.out.println(i);
    i++;
    }
    }
    
}
