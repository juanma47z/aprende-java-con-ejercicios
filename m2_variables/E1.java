/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m2_variables;

/**
 *
 * @author JM
 */
public class E1 {
  public static void main(String[] args) {
     /*
  Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.
  */
  
  int x;
  int y;
  
  x = 144;
  y = 999;
  
    System.out.println("X vale " + x);
    System.out.println("Y vale " + y);
    
    int suma = x + y;
    System.out.println("La suma de x + y es: " + suma);
    
    int resta = y - x;
    System.out.println("La resta de y - x es: " + resta);
    
    double division = (double) y / (double) x;
    System.out.println("La division de y % x es: " + division);
    
    int multi = x * y;
    System.out.println("La multiplicacion de x * y es: " + multi);
    
  }
 
  
}
