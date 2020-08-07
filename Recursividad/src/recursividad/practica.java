/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author quiro
 */
public class practica {
 public static int SumaRe(int x,int y){
     int resultado=0;
     for(int i=0;i<y;i++){
     resultado=x+SumaRe(x,y-1); 
     System.out.println(x+",");
         
     }
    /* if(x==0){
         return 1;
     }else{
         resultado=x+SumaRe(x);
         
     }
         
     */
    return resultado;
}
}
