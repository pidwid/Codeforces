package com.pidwid.asoj.div1;

import java.util.Arrays;
import java.util.Scanner;

// Puzzles 337A
public class Puzzles_337A {

  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int students = sc.nextInt();
    int puzzles = sc.nextInt();
    Integer[] puzzleSize = new Integer[puzzles];
    for(int i = 0; i < puzzles; i++){
      puzzleSize[i] = sc.nextInt();
    }
    sc.close();
    Arrays.sort(puzzleSize);
    int pointer1 = 1;
    int pointer2 = students;
    int min = 1000;
    while(pointer2 <= puzzles){
      if(puzzleSize[pointer2 - 1] - puzzleSize[pointer1 - 1] < min){
        min = puzzleSize[pointer2 - 1] - puzzleSize[pointer1 - 1];
      }
      pointer1++;
      pointer2++;
    }
    System.out.println(min);
  }
}
