/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tasca4ex4;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Tasca4ex4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Introdueix la mida del triangle: ");
    int n = input.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

