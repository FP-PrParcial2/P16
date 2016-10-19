/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema016;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema016 {

    /**
    16.	Realizar un programa que contenga una función que reciba como 
    * parámetros tres números y que devuelva y muestre el mayor de ellos.
    * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,D;
        D=entradaDatos();
 
        
    }
    public static int entradaDatos(){
    int a,b,c,D;
    Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa el primer número");
    a=entrada.nextInt();
        System.out.println("Ingresa el segundo número");
    b=entrada.nextInt();
        System.out.println("Ingresa el tercer número");
    c=entrada.nextInt();
    D=1;
     if((a>b) && (a>c)){
         System.out.println("El número mayo es:" + a);
     }
        else if((b>a) && (b>c)){
           System.out.println("El número mayor es:" + b);
                     }
        else if((c>a) && (c>b)){
               System.out.println("El número mayor es:" + c);
               
                 }
             else{
                       System.out.println("0");
             } 
    return D;
    }
}
