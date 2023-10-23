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
public class E2 {
  /*
  Realiza un conversor de pesos ARG a dolares. La cantidad de pesos que se quiere
convertir debe ser introducida por teclado.
  */
  
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    double pesosArg;
    double dolares = 0.0029;
    
    System.out.println("Digite cuantos pesos Argentinos tiene");
    
    pesosArg = read.nextDouble();
    
    double pesosToDolares = pesosArg * dolares;
    
    System.out.println("Usted tiene " + pesosToDolares + " dolares.");
  }
}
