/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Mamá
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("A","B","C","D","D","E","F"));
        lista.forEach(elemento -> {
            System.out.println("valor la lista" + elemento);
            if (elemento.equals("D")){
                System.out.println("se encontro la cadena");
            }
        });
        lista.add ("G");
        lista.add ("H");
        System.out.println("/n/n otra forma de recorrer la lista");
        for (String contenido : lista){
            System.out.println("valor de lista" + contenido);
        }
        lista.add ("I");
        lista.add ("J");
        lista.add ("K");
        String variable="L";
        lista.add (variable);
        System.out.println("/n/n otra forma de recorrer la lista");
        lista.stream().forEach((contiene) ->{
        System.out.println("contiene" + contiene);
        });
    }
    public static void mensaje(String valor){
        System.out.println("contiene" + valor);
    }
}
