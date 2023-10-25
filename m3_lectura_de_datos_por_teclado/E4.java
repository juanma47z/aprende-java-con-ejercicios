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
public class E4 {
  public static void main(String[] args) {
    /*
    Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado
    */
    
    Scanner read = new Scanner(System.in);
    
    int numeroUno;
    int numeroDos;
    int suma;
    int resta;
    int multi;
    double divi;
    
    System.out.println("Digite dos numeros enteros:");
    numeroUno = read.nextInt();
    numeroDos = read.nextInt();
    
    suma = numeroUno + numeroDos;
    
    System.out.println("La suma de sus numeros es " + suma);
    
    resta = numeroUno - numeroDos;
    
    System.out.println("La resta de sus numeros es " + resta);
    
    multi = numeroUno * numeroDos;
    
    System.out.println("La multi de sus numeros es " + multi);
    
    divi = (double)numeroUno / (double) numeroDos;
    
    System.out.println("La divi de sus numeros es " + divi);
    
  }
}
