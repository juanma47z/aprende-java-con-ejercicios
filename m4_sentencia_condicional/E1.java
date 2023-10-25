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
public class E1 {
  public static void main(String[] args) {
    /*
    Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
    */
    
    Scanner read = new Scanner(System.in);
    
    String diaSemanaUser;
    
    System.out.println("Dime que dia de la semana es: ");
    diaSemanaUser = read.nextLine();
    
    if(diaSemanaUser.equals("Lunes")){
      System.out.println("Hoy cursas Matemática I");
    }else if(diaSemanaUser.equals("Martes")){
      System.out.println("Hoy cursas Técnicas de Programación");
    }else if(diaSemanaUser.equals("Miercoles")){
      System.out.println("Arquitectura de Computadoras");
    }else if(diaSemanaUser.equals("Jueves")){
      System.out.println("Hoy cursas Sistemas y Organizaciones");
    }else{
      System.out.println("Hoy cursas Base de Datos");
    }
  }
}
