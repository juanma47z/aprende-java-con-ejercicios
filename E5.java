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
public class E5 {
  public static void main(String[] args) {
    /*
    Escribe un programa que calcule el área de un rectángulo
    */
    
    Scanner read = new Scanner(System.in);
    
    double largo;
    double alto;
    double areaRectangulo;
    
    System.out.println("Digite el largo del el rectangulo");
    
    largo = read.nextDouble();
    
    System.out.println("Digite el alto del rectangulo");
    
    alto = read.nextDouble();
    
    areaRectangulo = largo * alto;
    
    System.out.println("El area de tu rectangulo es de: " + areaRectangulo);
  }
}
