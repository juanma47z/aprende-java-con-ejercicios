/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m4_sentencia_condicional;

import java.util.Scanner;

/**
 *
 * @author JM
 */
public class E5 {
  public static void main(String[] args) {
    /*
    Realiza un programa que calcule la media de tres notas.
    */
    Scanner leer = new Scanner(System.in);
    
    int nota1;
    int nota2;
    int nota3;
    double mediaTresNotas;
    
    System.out.println("Digite las 3 notas de cada trimestre");
    
    nota1 = leer.nextInt();
    nota2 = leer.nextInt();
    nota3 = leer.nextInt();
    
    mediaTresNotas = (double) (nota1 + nota2 + nota3 ) / 3;
    
    System.out.println("La media de las tres notas es " + mediaTresNotas);
  }
}
