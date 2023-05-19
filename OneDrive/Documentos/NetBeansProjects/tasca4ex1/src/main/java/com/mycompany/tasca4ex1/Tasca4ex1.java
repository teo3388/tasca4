/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tasca4ex1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Tasca4ex1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Introdueix un número entre 1 i 10: ");
    int num = input.nextInt();
    if (num < 1 || num > 10) {
      System.out.println("El número ha d'estar comprès entre 1 i 10");
      return;
    }
    System.out.println("Taula de multiplicar de " + num + ":");
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " x " + i + " = " + (num*i));
    }
  }
}
