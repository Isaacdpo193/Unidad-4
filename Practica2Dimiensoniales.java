/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg2.dimiensoniales;

/**
 *
 * @author diego
 */
public class Practica2Dimiensoniales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        String[][] letras = {
           {"a","b","c","d","e"},
           {"f","g","h","i","j"},
           {"k","l","m","n","o"}
    };
       //guardar
       for (int i = 0; i < letras.length; i++) {
           for(int j = 0; j < letras [i].length; j++){
               System.out.print(letras[i][j] +",");
           }
           System.out.println();
    }
    
    }
}
