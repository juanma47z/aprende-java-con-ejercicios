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
public class E6 {
  public static void main(String[] args) {
    /*
    Escribe un programa que calcule el área de un triángulo.
    */
    
    Scanner read = new Scanner(System.in);
    
    double alto;
    double largo;
    double area;
    
    // alto * largo / 2
    
    System.out.println("Digite el alto");
    alto = read.nextDouble();
    
    System.out.println("Digite el largo");
    
    largo = read.nextDouble();
    
    area = alto * largo / 2;
    
    System.out.println("El area de tu triangulo es de " + area);
    
  }
  
}
