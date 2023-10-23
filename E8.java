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
public class E8 {
  public static void main(String[] args) {
    /*
    Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 120 pesos la hora.
    */
    
    Scanner read = new Scanner(System.in);
    
    int horasTrabajadasEmpleado;
    int montoHoraTrabajada = 120;
    int salariEmpleadoSemanal;
    
    System.out.println("Digite cuantas horas trabajo esta semana");
    
    horasTrabajadasEmpleado = read.nextInt();
    
    salariEmpleadoSemanal = horasTrabajadasEmpleado * montoHoraTrabajada;
    
    System.out.println("El salario a abonar de este semana es de " + salariEmpleadoSemanal);
  }
}
