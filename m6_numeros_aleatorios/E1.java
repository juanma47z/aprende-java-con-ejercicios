/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m6_numeros_aleatorios;

/**
 *
 * @author JM
 */
public class E1 {
  public static void main(String[] args) {
    /*
    Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
    */
    
    //dato entrada
    //algoritmo
    //dato salida: numale de tres dados, suma total.
    
    //dato1 -> numale
    //dado2 -> numale
    //dado3 -> numale
    
    int dadoUno = (int) (Math.random()*6)+1;
    int dadoDos = (int) (Math.random()*6)+1;
    int dadoTres = (int) (Math.random()*6)+1;

    System.out.println("Dado uno " + dadoUno);
    System.out.println("Dado dos " + dadoDos);
    System.out.println("Dado tres " + dadoTres);
    
    int sumaTotal = dadoUno + dadoDos + dadoTres;
    
    System.out.println("La suma de sus dados es " + sumaTotal);
  }
}
