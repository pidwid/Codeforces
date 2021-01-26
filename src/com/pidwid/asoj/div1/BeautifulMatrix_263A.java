package com.pidwid.asoj.div1;

import java.util.Scanner;
// 263A Beautiful Matrix
public class BeautifulMatrix_263A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int a = 0 ,b = 0;
    for (int i = 1; i < 6; i++)
      for (int j = 1; j < 6; j++){
      if(sc.nextInt() == 1){
        a = i;
        b = j;
      }
      }
    int count = Math.abs(3 - a) + Math.abs(3 - b);
    System.out.println(count);
    sc.close();
  }
}
