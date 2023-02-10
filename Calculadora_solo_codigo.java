
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */




package com.mycompany.calculadora_solo_codigo;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Estudiante
 */
public class Calculadora_solo_codigo {
static Scanner leer = new Scanner(System.in);




    public static void main(String[] args) {
        int oper;
        double resultado;
    
        System.out.println("Elija el número de la operación que va a realizar: ");
    	System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. Divisiónn");
        System.out.println("5. Seno");
        System.out.println("6. Coseno");
        System.out.println("7. Tangente");
        System.out.println("8. Raiz enésima");
        System.out.println("9. Potencia enésima");
        System.out.println("10. Calcular IVA");
        oper = leer.nextInt();
        resultado = calculo(oper);
        System.out.print("El resultado es: ");
        System.out.print(resultado);
        
    }
    
    public static double calculo(int oper){
        
        double a ,b;
        double resultado;
        //System.out.println("Llegamos a la función ");
        switch(oper){
            case 1:
                System.out.println("Digite los números a sumar: ");
                a = leer.nextInt();
                b = leer.nextInt();
                resultado = a + b;
                break;
            case 2:
                System.out.println("Digite los números a restar: ");
                a = leer.nextInt();
                b = leer.nextInt();
                resultado = a - b;
                break;
            case 3:
                System.out.println("Digite los números a multiplicar: ");
                a = leer.nextInt();
                b = leer.nextInt();
                resultado = a * b;
                break;
            case 4:
                System.out.println("Digite los números a dividir: ");
                a = leer.nextInt();
                b = leer.nextInt();
                resultado = a / b;
                break;
            case 5:
                System.out.println("Digite el número en radianes: ");
                a = leer.nextInt();
                resultado = Math.sin(a);
                break;
            case 6:
                System.out.println("Digite el número en radianes: ");
                a = leer.nextInt();
                resultado = Math.cos(a);
                break;
            case 7:
                System.out.println("Digite el número en radianes: ");
                a = leer.nextInt();
                resultado = Math.tan(a);
                break;
            case 8:
                System.out.println("Digite el número a radicar y la raiz: ");
                a = leer.nextInt();
                b = leer.nextInt();
                resultado = Math.pow(a,(1/b));
                System.out.println(resultado);
                break;
             case 9:
               System.out.println("Digite el número y el exponente: ");
                a = leer.nextInt();
                b = leer.nextInt();
                resultado = Math.pow(a,b);
                break;
            case 10:
               System.out.println("Digite el precio del producto y el valor del iva: ");
                a = leer.nextInt();
                b = leer.nextInt();
                resultado = a*(b/100);
                break;
            default:
                System.out.println("No es una opción");
                resultado = 0.000000;
                break;


        }
       return resultado; 
    }
}

