package com.pidwid.asoj.div1;

import java.util.Scanner;

// 208 A Dubstep
public class Dubstep {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String[] resArr = text.split("WUB");
    StringBuilder str = new StringBuilder();
    for(String i: resArr){
      str.append(i).append(" ");
    }
    System.out.println(str.toString().trim());
    sc.close();
  }
}
