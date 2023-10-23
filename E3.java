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
public class E3 {
  public static void main(String[] args) {
    /*
    Realiza un conversor de dolares a pesos Arg. La cantidad de euros que se quiere
convertir debe ser introducida por teclado
    */
    
    Scanner read = new Scanner(System.in);
    
    double dolares;
    double pesos = 349.98;
    double dolaresToPeso;
    
    System.out.println("Digite cuantos dolares tiene: ");
    
    dolares = read.nextDouble();
    
    dolaresToPeso = dolares * pesos;
    
    System.out.println("Usted tiene " + dolaresToPeso + " pesos Argentinos.");
    
  }
}
