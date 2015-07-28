
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
        if (x > 0) {
            imprimir(x-1);//Aqui se llama a si misma
            System.out.println(x);            
        }    
    }
    
    public static void imprimir2(int x){
        if (x > 0) {
            System.out.println(x);
            imprimir2(x-1);//Aqui se llama a si misma
        }
    }
    
    public static int factorial(int fact){
        if (fact > 0) {
            int var = fact * factorial(fact - 1);//Aqui se llama a si misma
            return var;
        }
            return 1;
    }
    
    public static boolean Palindromo(String pal){
        if(pal.length() == 0 || pal.length() == 1)
            return true;
        else
            if(pal.charAt(0) == pal.charAt(pal.length()-1))
                return Palindromo(pal.substring(1, pal.length()-1));//Aqui se llama a si misma
        return false;
    }
    
    public static void main(String[] arguments) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        Recursiva llamar = new Recursiva();
        
        int num, elegir, factor, nFact; String opc, palabra; boolean instPalabra;
        
        do{
            System.out.println("\nBienvenido al Programa de Familiarización con las Funciones Recursivas\n"
                    + "\n\t1. Imprimir Ascendente/Descendente\n\t2.Calcular Factorial\n\t3.Palindromo con Recursion\n\n");
            
            System.out.print("Elija una Opcion: ");
            elegir = sc.nextInt();
            
            switch(elegir){
                case 1:
                    System.out.print("Ingrese numero:   ");
                    num = sc.nextInt();

                    llamar.imprimir(num);
                    System.out.println("\n* * *\n");
                    llamar.imprimir2(num);    
                    break;
                case 2:
                    System.out.print("Numero a Factorizar:  ");
                    nFact = sc.nextInt();
                    factor = llamar.factorial(nFact);
                    System.out.println("El Factorial de "+nFact+" es: "+factor);
                    break;
                case 3:
                    System.out.print("Ingrese Palabra a Verificar:    ");
                    palabra = sc.next();
                    instPalabra = llamar.Palindromo(palabra);
                    if (instPalabra == true) {
                        System.out.println(palabra+"    SI es Palindromo");
                    }else
                        System.out.println(palabra+"    NO es Palindromo");
                    break;
            }
            
            System.out.print("Desea Salir?  ");
            opc = sc.next();
        }while(opc.equalsIgnoreCase("no"));   
    }
}
