package com.pidwid;
import java.util.Scanner;

//71A - Way Too Long Words
public class waytoolongwords {
  public static void main(String[] args) {
    int num;
    Scanner input = new Scanner(System.in);
    num=input.nextInt();
    while(num >=0){
      String text = input.nextLine();
      int len = text.length();
      if(len <= 10) System.out.println(text);
      else System.out.println(text.charAt(0) + "" + (len-2) + "" + text.charAt(len-1));
      num--;
    }
  }
}
