/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

/**
 *
 * @author quiro
 */
public class Fibonacci {
     

    
    public int Fibonacci(int x) {
        
        if(x==1  ){
           return 1;
           
        } if(x==0){
            return 0;
            }else{
            return Fibonacci(x-1)+Fibonacci(x-2);
            
        }
         
  }
    }
    

