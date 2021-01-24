package com.pidwid.asoj.div1;

import java.util.HashMap;
import java.util.Scanner;

// 136-A Presents
public class Presents {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 1; i <= num; i++){
      map.put(sc.nextInt(),i);
    }
    for(int i = 1; i<=num; i++){
      if(i == num) System.out.print(map.get(i));
      else System.out.print(map.get(i) + " ");
    }
    sc.close();
  }

}
