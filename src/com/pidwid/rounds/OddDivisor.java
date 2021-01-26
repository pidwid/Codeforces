package com.pidwid.rounds;

import java.util.Scanner;

// Codeforces Round #697 (Div. 3)
public class OddDivisor {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    long[] arr = new long[num];
    for(int i = 0; i< num; i++){
      arr[i] = sc.nextLong();
    }
    sc.close();
    for(int i = 0; i< num; i++){
      if(arr[i] % 2 != 0){
        System.out.println("YES");
      }else {
        if(arr[i] % 2 == 0 && arr[i] > 2){
          if(arr[i] % 7 == 0 || arr[i] % 5 == 0 || arr[i] % 3 == 0) System.out.println("YES");
          else System.out.println("NO");
        }else System.out.println("NO");
      }
    }
  }
}
