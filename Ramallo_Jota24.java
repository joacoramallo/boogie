/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramallo_jota24;

/**
 *
 * @author pc13
 */
public class Ramallo_Jota24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int dia = 5;
    String nomdia;
    
    switch(dia){
        case 1: nomdia="Lunes";
        break;
        case 2: nomdia = "Martes";
        break;
        case 3: nomdia = "Miercoles";
        break;
        case 4: nomdia = "Jueves";
        break;
        case 5: nomdia = "Viernes";
        break;
        case 6: nomdia = "Sabado";
        break;
        case 7: nomdia = "Domingo";
        break;
        default: nomdia = "dia invalido";
        break;
    }
        System.out.println(nomdia);
    }
    
}
