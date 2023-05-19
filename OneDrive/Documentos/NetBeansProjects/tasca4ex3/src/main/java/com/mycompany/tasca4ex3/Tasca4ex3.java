/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tasca4ex3;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Tasca4ex3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int aprovats = 0;
    int suspesos = 0;
    for (int i = 1; i <= 6; i++) {
      System.out.print("Introdueix la nota " + i + ": ");
      double nota = input.nextDouble();
      if (nota >= 4 && nota < 5) {
        aprovats++;
      } else if (nota >= 5) {
        aprovats++;
      } else {
        suspesos++;
      }
    }
    System.out.println("Nombre d'alumnes aprovats: " + aprovats);
    System.out.println("Nombre d'alumnes suspesos: " + suspesos);
  }
}
