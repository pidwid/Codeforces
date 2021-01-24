package com.pidwid.asoj.div1;


import java.util.Scanner;

// 451  Game With Sticks
public class GameWithSticks {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hori_n = sc.nextInt();
    int vert_m = sc.nextInt();
    int i = Math.min(hori_n, vert_m);
    if (i % 2 == 0) System.out.println("Malvika");
    else System.out.println("Akshat");
  }
}
