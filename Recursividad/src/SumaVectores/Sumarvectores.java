/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package SumaVectores;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author quiro
 */
public class Sumarvectores {
    public static int vector (int A[], int numero){
        if(numero==0){
            return A[numero];
            
        
    }else{
            return A[numero]+vector(A,numero-1);
        }
        
    }
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v[],n;
        System.out.println("Ingrese el tamaño del  vector");
        n= Integer.parseInt(br.readLine());
        v= new int [n];
        
        for (int i=0;i<n;i++){
            System.out.println("v ["+ i +"] -");
            v[i]=Integer.parseInt(br.readLine());
            
        }
    }
    
}
