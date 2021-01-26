package com.pidwid.asoj.div1;

import java.util.Scanner;

// 4A - Watermelon

public class Watermelon_4A {
  public static void main(String[] args) {
    int num;
    Scanner input = new Scanner(System.in);
    num=input.nextInt();
    if(num %2 == 0 && num >2) System.out.print("YES");
    else System.out.print("NO");
    input.close();
  }
}
