/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;
import ec.edu.ister.modelo.Lista;
import java.util.Random;

/**
 *
 * @author USUARIO
 */

public class Aplicacion {
    public static void main(String[] args) {
                
         Random r;
        int d;
        Lista lista;
        int k;
        r=new Random(); 
        lista=new Lista();                      
        k=Math.abs(r.nextInt()%55);             
        
        for(;k>0;k--){
            d=r.nextInt()%99;
            lista.insertarCabezaLista(d);   
        }
      
        System.out.println("Elementos de la lista generados al azar");
        lista.visualizar();  

        System.out.println("\n\nLa lista se encuentra vacia? :   "+lista.ListaVacia());
    }
    
    

}