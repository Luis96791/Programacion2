
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LEFF
 */
public class Recursiva {
    public static void imprimir(int x) {
        if (x>0) {
            imprimir(x-1);
            System.out.println(x);            
        }    
    }
    
    public static void imprimir2(int x){
        if (x>0) {
            System.out.println(x);
            imprimir2(x-1);
        }
    }
    
    public static void main(String[] ar) {
        Recursiva re = new Recursiva();
        Recursiva re1 = new Recursiva();
        re.imprimir(5);
        System.out.println("\n*******************\n");
        re1.imprimir2(10);
    }
}
