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
public class E10 {
  public static void main(String[] args) {
    /*
    Realiza un conversor de Mb a Kb.
    */
    
    Scanner read = new Scanner(System.in);
    
    int Mb;
    int Kb = 1000;
    int MbToKb;
    
    System.out.println("Digite cuantos Mb tiene su dispositivo:");
    
    Mb = read.nextInt();
    
    MbToKb = Mb * Kb;
    
    System.out.println("Su dispositivo tiene " + MbToKb);
    
  }
}
