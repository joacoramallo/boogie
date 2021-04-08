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
public class Ramallo_Jota13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    float Radio, longitud, area;
    System.out.println("Ingrese el Radio del circulo");
    Radio = entrada.nextFloat();
    longitud = (float) (2*3.14*Radio); 
    area = (float) (3.14*Radio*Radio);
    System.out.println("La longitud es de "+longitud+" y el area de "+area);
    }
    }
    

