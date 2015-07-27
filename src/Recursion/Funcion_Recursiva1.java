/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author LEFF
 */
public class Funcion_Recursiva1 {
    /*public static double suma1N(int n){
           if(n == 1)  //caso base
              return 1;
           else
              return n + suma1N(n-1);
    }                   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
           System.out.print("Introduce un numero entero >0 ");
           num = sc.nextInt();
        }while(num<=0);
        System.out.println("Suma desde 1 hasta " + num + " = " + suma1N(num));
    }*/
    
    public static int Print(int n){
        if(n >1){
            return Print(n-1);
            //System.out.println(n);
        }else{
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
       // do{
            System.out.print("Numero > a 1---->     ");
            num = sc.nextInt();
       // }while(num <=1);
        System.out.println("Mostrar de 1 hasta"+num+" = "+Print(num));
    }
}
