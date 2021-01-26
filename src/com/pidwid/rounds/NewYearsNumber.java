package com.pidwid.rounds;

import java.util.Scanner;

// Codeforces Round #697 (Div. 3)
// https://codeforces.com/contest/1475/problem/B
public class NewYearsNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    long[] arr = new long[num];
    for(int i = 0; i< num; i++){
      arr[i] = sc.nextLong();
    }
    sc.close();
    for(int i = 0; i< num; i++){
      if((arr[i] % 2020 == 0 || arr[i] % 2021 == 0) && arr[i] >= 2020){
        System.out.println("YES");
      }else {
        long z = arr[i];
        while(z % 2020 != 0 && z >= 2020){
        z -= 2021;
        }
        if(z % 2020 == 0 && z >= 2020) System.out.println("YES");
        else System.out.println("NO");
      }
    }
  }

}
