/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author quiro
 */
public class prueba {
     public void mostrarArray(int[] array, int index){
//        1era forma/
        if(index != array.length){
            System.out.println(array[index]);
            mostrarArray(array,index+1);
        }
        }
     }
    

