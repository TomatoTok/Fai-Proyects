/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Simpson13 {
     public static void main (String []arg){
    Scanner sc = new Scanner(System.in);
    double h,n,a,b,x,valor,sumaPar=0,sumaImp=0,aux,x2;
        System.out.println("Ingrese el extremo a");
        a=sc.nextDouble();
        System.out.println("Ingrese el extremo b");
        b=sc.nextDouble();
        System.out.println("Ingrese la cantidad de partes(n)");
        n=sc.nextDouble();
        //Calculos
        h=(b-a)/n;
        x=(Math.abs(b)+ Math.abs(a))/n;
        //x2 es lo que se le suma al x para moverse en la funcion
        x2=a+x;
        //Muestra de valores
        System.out.println("El h es:"+h);
        System.out.println("La tabla de valores es:\ni:0 x:"+a+" f(x):"+f(a));
        valor=f(a)+f(b);
        for (int i = 1; i < n; i++) {
            aux=f(x2);
            if (i%2 == 0) {
                sumaPar=sumaPar+aux;
            }else{
            sumaImp=sumaImp+aux;}
            System.out.println("i: "+i+" x"+i+": "+x2+" f(x): "+aux);
            x2=x2+x;
            
        }
        sumaPar=sumaPar*2;
        sumaImp=sumaImp*4;
        valor=(h/3)*(valor+sumaPar+sumaImp);
        System.out.println("i: "+(int)n+" x: "+b+" f(x): "+f(b));
        System.out.println("valor aproximado: "+ valor);
    }

public static double f(double x){
    double resultado = Math.tan(x);  // <----- INSERTAR FUNCION
    return resultado;
    }
    
}
