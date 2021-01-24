package com.pidwid.asoj.div1;

import java.util.Scanner;

// 58-A Chat Room
public class ChatRoom{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    char[] defArr = {'h','e','l','l','o'};
    int defCount = 0;
    for(int i = 0; i< text.length(); i++){
      if (defCount < defArr.length && text.charAt(i) == defArr[defCount]){
        defCount++;
      }
    }
    if(defCount >= defArr.length) {
      System.out.println("YES");
      return;
    }
    System.out.println("NO");
    sc.close();
  }
}
