package com.pidwid.asoj.div1;

import java.util.*;

// 479A Expression
public class Expression_479A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no1, no2, no3;
    no1 = sc.nextInt();
    no2 = sc.nextInt();
    no3 = sc.nextInt();
    sc.close();
    if(no1 == 1 || no2 == 1 || no3 == 1){
      Integer arr = new Integer[6];
      arr[0] = no1 + no2 + no3;
      arr[1] = no1 * (no2 + no3);
      arr[2] = (no1 + no2) * no3;
      arr[3] = (no1 * no2) + no3;
      arr[4] = no1 + (no2 * no3);
      arr[5] = no1 * no2 * no3;
      System.out.println(Collections.max(Arrays.asList(arr)));
    }
    else System.out.println(no1 * no2 *  no3);


  }
}
