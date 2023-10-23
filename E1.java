/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m3_lectura_de_datos_por_teclado;

import java.util.Scanner;

/**
 *
 * @author JM
 */
public class E1 {
  public static void main(String[] args) {
    /*
    Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
    */
    
    Scanner read = new Scanner(System.in);
    
    int numeroUno;
    int numeroDos;
    int multiplicacion;
    
    System.out.println("Digita dos numeros para ser multiplicados");
    
    numeroUno = read.nextInt();
    numeroDos = read.nextInt();
    
    multiplicacion = numeroUno * numeroDos;
    
    System.out.println("La multi de tus numero es " + multiplicacion );
    
    
  }
  
}
