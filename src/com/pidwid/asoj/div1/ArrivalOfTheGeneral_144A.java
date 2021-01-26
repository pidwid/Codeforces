package com.pidwid.asoj.div1;

import java.util.Scanner;

// 144A Arrival of the General
public class ArrivalOfTheGeneral_144A {
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int inputSize = sc.nextInt();
    int max = 0, min = 101, maxindex = 0, minIndex = 0;
    Integer[] arr = new Integer[inputSize];
    for(int i  = 0; i < inputSize; i++){
      arr[i] = sc.nextInt();
      if(arr[i] > max){
        max = arr[i];
        maxindex = i;
      }
      if(arr[i] <= min){
        min = arr[i];
        minIndex = i;
      }
    }
    if (minIndex < maxindex) {
      System.out.println(maxindex + (arr.length - minIndex - 1) - 1);
    }else{
      System.out.println(maxindex + (arr.length - minIndex - 1));
    }
    sc.close();
  }
}
