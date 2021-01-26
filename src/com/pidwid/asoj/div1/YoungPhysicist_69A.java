package com.pidwid.asoj.div1;

import java.util.Scanner;

// 69A Young Physicist
public class YoungPhysicist_69A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOfForces = sc.nextInt();
    int[][] mat = new int[numOfForces][3];
    int[] sum = new int[3];
    for(int i = 0; i < numOfForces; i++){
      for(int j = 0; j < 3; j++){
        mat[i][j] = sc.nextInt();
        sum[j] += mat[i][j];
      }
    }
    if(sum[0] != 0 || sum[1] != 0 || sum[2] != 0) System.out.println("NO");
    else System.out.println("YES");
   sc.close();
  }
}
