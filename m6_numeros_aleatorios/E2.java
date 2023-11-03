/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m6_numeros_aleatorios;

/**
 *
 * @author JM
 */
public class E2 {
  public static void main(String[] args) {
    /*
    Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n).
    */
    
     
    //datosalida: nombre de una carta de la baraja francesa
    //la baraja se divide en 4 palos: picas, corazones, diamantes y treboles
    //cada palo esta formado por 13 cartas de las cuales 9 son numerales (2 al 10)
    //4 literales (J,Q,K,A=1)
    
    for(int i=1; i <= 10; i++){
      int numAle = (int) (Math.random()*12)+1;
    int paloAletorio = (int) (Math.random()*4)+1;
    
    
    switch (paloAletorio) {
      case 1:
        if(numAle == 1){
          System.out.println("A de picas");
        }else if(numAle <= 9){
          System.out.println(numAle + " de picas");
        }else if(numAle == 10){
          System.out.println("J de picas");
        }else if(numAle == 11){
          System.out.println("Q de picas");
        }else if(numAle == 12){
          System.out.println("K de picas");
        }
        break;
      case 2:
        if(numAle == 1){
          System.out.println("A de corazones");
        }else if(numAle <= 9){
          System.out.println(numAle + " de corazones");
        }else if(numAle == 10){
          System.out.println("J de corazones");
        }else if(numAle == 11){
          System.out.println("Q de corazones");
        }else if(numAle == 12){
          System.out.println("K de corazones");
        }
        break;
      case 3:
        if(numAle == 1){
          System.out.println("A de diamantes");
        }else if(numAle <= 9){
          System.out.println(numAle + " de diamantes");
        }else if(numAle == 10){
          System.out.println("J de diamantes");
        }else if(numAle == 11){
          System.out.println("Q de diamantes");
        }else if(numAle == 12){
          System.out.println("K de diamantes");
        }
        break;
      case 4:
        if(numAle == 1){
          System.out.println("A de treboles");
        }else if(numAle <= 9){
          System.out.println(numAle + " de treboles");
        }else if(numAle == 10){
          System.out.println("J de treboles");
        }else if(numAle == 11){
          System.out.println("Q de treboles");
        }else if(numAle == 12){
          System.out.println("K de treboles");
        }
      break;  
      default:
        throw new AssertionError();
    }
    }
    
    
    
    
    
    
  }
}
