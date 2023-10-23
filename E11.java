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
public class E11 {
  public static void main(String[] args) {
    /*
    Realiza un conversor de Kb a Mb.
    */
    Scanner read = new Scanner(System.in);
    
    int Kb;
    int Mb;
    double KbToMb;
    
    System.out.println("Digite cuantos Kb tiene su dispositivo:");
    
    Kb = read.nextInt();
    
    KbToMb = (double) Kb / (double) 1000;
    
    System.out.println("Su dispositivo tiene " + KbToMb + " Mb.");
  }
}
