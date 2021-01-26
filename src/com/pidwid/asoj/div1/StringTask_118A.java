package com.pidwid.asoj.div1;
import java.util.Scanner;

// 118A - String Task
  public class StringTask_118A {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String text = input.nextLine();
      text = text.toLowerCase();
      StringBuilder string = new StringBuilder();
      for(int i = 0; i< text.length(); i++){
        if(!isVowel(text.charAt(i))){
          string.append('.').append(text.charAt(i));
        }
      }
      System.out.println(string.toString());

      input.close();
      }
    public static boolean isVowel(char c) {
      String s = "aeiouy";
      for (int i = 0; i < s.length(); i++)
        if (s.charAt(i) == c)
          return true;
      return false;
    }
    }
