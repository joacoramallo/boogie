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
public class Ramallo_Jota12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    float km, m;
    System.out.println("Ingrese los kilometros por hora");
    km = entrada.nextFloat();
    m = (float) (km/(3.6));
        System.out.println("El resultado es "+m+" metros por segundo");
    }
}
