package com.pidwid.asoj.div1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 160A - Twins
public class Twins_160A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOfCoins = sc.nextInt();
    Integer[] coinArray = new Integer[numOfCoins];
    int coinSum = 0;
    for(int i = 0; i < numOfCoins; i++){
      coinArray[i] = sc.nextInt();
      coinSum += coinArray[i];
    }
    int mid = coinSum/2;
    Arrays.sort(coinArray, Collections.reverseOrder());
    int moreThanMid = 0;
    int count  = 0;
    for (Integer coin : coinArray) {
      if (moreThanMid <= mid) {
        moreThanMid += coin;
        count++;
      }
    }
    System.out.println(count);
    sc.close();
  }
}
