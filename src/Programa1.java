
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
public class Programa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        String ingreso; int cont = 0, cont1 = 0;
        
        System.out.print("-  String: ");
        ingreso = sc.next();
        
        for (int i = 0; i <ingreso.length(); i++) {
           /* if ((ingreso.charAt(i)=='a')||(ingreso.charAt(i)=='e')||(ingreso.charAt(i)=='i')
                    ||(ingreso.charAt(i)=='o')||(ingreso.charAt(i)=='u')) {
                cont++;
            }
            
            if (ingreso.charAt(i)=='1'||ingreso.charAt(i)=='2'||ingreso.charAt(i)=='3'||ingreso.charAt(i)=='4'
                    ||ingreso.charAt(i)=='5'||ingreso.charAt(i)=='6'||ingreso.charAt(i)=='7'||ingreso.charAt(i)=='8'||ingreso.charAt(i)=='9'||ingreso.charAt(i)=='0') {
                cont++;
            }*/
            char correr = ingreso.charAt(i);
            
            switch(correr){
                case 'a':
                    case 'e':
                        case'i':
                            case'o':
                                case'u':
                                    cont++;
                                    break;
                                    
                                case '1':
                                case '2':
                                case'3':
                                case'4':
                                case'5':
                                case'6':
                                case'7':
                                case'8':
                                case'9':
                                case'0':
                                    cont1++;
                                    break;
            }
        }
        System.out.println("Cantidad de Vocales: "+cont);
        System.out.println("Cantidad de Digitos: "+cont1);
        
    }
}
