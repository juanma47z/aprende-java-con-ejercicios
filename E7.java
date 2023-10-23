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
public class E7 {
  public static void main(String[] args) {
    /*
    Escribe un programa que calcule el total de una factura a partir de la base
imponible.
    */
    
    Scanner read = new Scanner(System.in);
    
    double productoA;
    double productoB;
    
    double baseImponible;
    
    final double IVA = 0.21;
    
    double IvaDelTotal;
    
    double totalMasIva;
    
    System.out.println("Digite el precio del producto A");
    
    productoA = read.nextDouble();
    
    System.out.println("Digite el precio del producto B");
    
    productoB = read.nextDouble();
    
    baseImponible = productoA + productoB;
    
    System.out.println("Subtotal sin IVA " + baseImponible);
    
    IvaDelTotal = baseImponible * IVA;
    
    System.out.println("IVA de su Total " + IvaDelTotal);
    
    totalMasIva = baseImponible + IvaDelTotal;
      
    System.out.println("Total a abonar: " + totalMasIva);
    
  }
  
}
