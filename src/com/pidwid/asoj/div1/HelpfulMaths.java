package com.pidwid.asoj.div1;

import java.util.Arrays;
import java.util.Scanner;

// 339A - Helpful Maths
public class HelpfulMaths {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String[] arr = text.split("\\+");
    Integer[] intarray=new Integer[arr.length];
    int i=0;
    for(String str:arr){
      intarray[i]=Integer.parseInt(str.trim());
      i++;
    }
    Arrays.sort(intarray);
    StringBuilder res = new StringBuilder();
    for(int j = 0; j < intarray.length; j++){
      if(j == (intarray.length -1)) res.append(intarray[j]);
      else res.append(intarray[j]).append('+');
    }
    System.out.println(res);
  }
}
