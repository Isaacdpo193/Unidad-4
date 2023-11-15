
package tabla59;


public class Tabla59 {
    
    public static int [] consumoDias(int [][]agua){
        int [] dias = new int [5];
        
        for (int j = 0; j < agua[0].length; j++) {
            int sumadias =0;
            for (int i = 0; i < agua.length; i++) {
                sumadias+= agua[i][j];
            }
            dias [j] = sumadias;
        }
        return dias;
    }


    public static int[]consumoDeAgua(int [][]agua) {
        int[] casa = new int [4];
     
    for (int i = 0; i < agua.length; i++){
        int suma = 0;
        for (int j = 0; j < agua [i].length; i++){
            suma+= agua [i][j];
        }
        casa[i] = suma;
    }
    return casa;
    }
    public static void main (String []args){
        int [][] agua ={
            {100,50,30,120,60},
            {32,122,46,80,90},
            {45,100,56,26,36},
            {60,110,72,33,40}
        };
        int [] conDeAgua = Tabla59.consumoDeAgua(agua);
        for (int i = 0; i < conDeAgua.length; i++) {
            System.out.println("El consumo de agua por casa es: " +conDeAgua[i]);
        }
        System.out.println(" ");
        int[] conDedias= Tabla59.consumoDias(agua);
        for (int j = 0; j < conDedias.length; j++) {
            System.out.println("La cantidad de consumo de agua por dia es: "+ conDedias[j]);
        }
    }}