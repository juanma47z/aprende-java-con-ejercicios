
package newpackage;

import java.util.Scanner;


public class CajeroAutomatico {
  /*
  Hacer un cajero automatico con un saldo inicial de $1000 y tendra el siguiente menu de opciones:
  
  1. Ingresar dinero en la cuenta

  2. Retirar dinero de la cuenta

  3. Mostrar dinero disponible

  4. Salir.
  
  https://www.reddit.com/r/devsarg/comments/187yzr4/comment/kbhr4i3/?context=3
  */
  
  static Scanner read = new Scanner(System.in);
  static double saldoUsuario;
  
  public static void main(String[] args) {
    
    try {
    System.out.println("Bienvenido");
    
    saldoUsuario = 1000;
    
    int opcionUsuario = 0;
    
    do {      
      System.out.println("Qué desea hacer?");
      
      System.out.println("1. Ingresar dinero en la cuenta \n"
        + "2. Retirar dinero de la cuenta \n"
        + "3. Mostrar dinero disponible \n"
        + "4. Salir. \n");
      
      opcionUsuario = read.nextInt();
      
      switch (opcionUsuario) {
        case 1:
          ingresarDinero();
          break;
        case 2:
          retirarDinero();
          break;
        case 3:
          mostrarDinero();
          break;
        case 4:
          break;
        default:
          System.out.println("La opcion elegida no pertenece a ninguna.");
          break;
      }
      
    } while (opcionUsuario != 4);
    
    } catch (Exception e) {
      
      System.out.println("Error!");
    }
        
  }
  
  public static void ingresarDinero(){
    System.out.println("Cuanto dinero desea ingresar?");
    
    double saldoIngresado = read.nextDouble();

    //Validar que el ingreso de dinero sea positivo.
    if(saldoIngresado > 0){
      saldoUsuario = saldoUsuario + saldoIngresado;
      mostrarDinero();
    }else{
      System.out.println("El saldo debe ser positivo");
    } 
  }
  
  public static void retirarDinero(){
    System.out.println("Cuanto dinero desea retirar?");
    
    double saldoRetirar = read.nextDouble();
    
    
    //Validar que el retiro no supere el saldo actual.
    if(saldoRetirar > saldoUsuario){
      System.out.println("El saldo a retirar supera su saldo actual.");
      
      //Validar que el retiro sea un número positivo
    }if(saldoRetirar < 0){
      System.out.println("El saldo a retirar debe ser un numero positivo."); 
    }else{
      saldoUsuario = saldoUsuario - saldoRetirar;
      mostrarDinero();
    }
    
  }
  
  public static void mostrarDinero(){
    System.out.println("El saldo total es de " + saldoUsuario);
    System.out.println("\n"); 
  }
}

//https://www.reddit.com/r/devsarg/comments/187yzr4/comment/kbhr4i3/?context=3


