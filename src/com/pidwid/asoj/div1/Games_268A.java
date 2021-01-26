package com.pidwid.asoj.div1;


import java.util.Scanner;

// 268A Games
public class Games_268A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputSize = sc.nextInt();
    int[] home = new int[inputSize];
    int[] guest = new int[inputSize];
    for(int i = 0; i < inputSize; i++){
      home[i] = sc.nextInt();
      guest[i] = sc.nextInt();
      
    }
    int count = 0;
    for(int i = 0; i < inputSize; i++){
      for(int j = 0; j < inputSize; j++){
        if(home[i] == guest[j]){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
