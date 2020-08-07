/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;
/**
 *
 * @author quiro
 */
public class Array {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int array[]=new int [10];
        int posicion=1;
        int op = 0;
       
      
       
        for (int i=0;i<10;i++){
            System.out.println("Ingrese el numero en la posicion "+posicion);
            posicion=posicion+1;
            array[i]=teclado.nextInt();
        }
        
        System.out.print("Presione 1 para mostar el array o 2 para eliminarlo ");
        if (op==1){
             prueba f = new prueba();
              f.mostrarArray(array, 0);
        }if(op==2){
            //
           //
            
        }else {
            System.out.println("Gracias");
        }
        
        
        
    }
     }
   
   
   

