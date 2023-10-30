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
public class E4 {
  
  public static void main(String[] args) {
    /*
  Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 120 pesos la hora. A partir de la hora 41, se pagan a 160 pesos
la hora.
  */
  
  Scanner read = new Scanner(System.in);
    
    int horasTrabajadasEmpleado;
    int horasOrdinarias = 120;
    int salariEmpleadoSemanal;
    int horasExtras = 160;
    int salarioEmpleadoSemanalApartirCuarentaHoras;
    
    System.out.println("Digite cuantas horas trabajo esta semana");
    
    horasTrabajadasEmpleado = read.nextInt();
    
    if(horasTrabajadasEmpleado >= 41){
      salarioEmpleadoSemanalApartirCuarentaHoras = horasTrabajadasEmpleado * horasExtras;
      System.out.println("El salario a abonar es de " + salarioEmpleadoSemanalApartirCuarentaHoras);
    }else{
      salariEmpleadoSemanal = horasTrabajadasEmpleado * horasOrdinarias;
      System.out.println("El salario a abonar de este semana es de " + salariEmpleadoSemanal + ".");
    }
   
  }
      
}
