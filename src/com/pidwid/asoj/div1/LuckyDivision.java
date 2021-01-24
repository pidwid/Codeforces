package com.pidwid.asoj.div1;

import java.util.Scanner;

// 122-A Lucky Division
public class LuckyDivision{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] div = {4,7,44,47,74,77,444,447,474,477,747,744,777};
    for(int i: div){
      if(num % i ==0){
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
    sc.close();
  }
}



// public class LuckyDivision{
//   public static void main(String[] args){
//     LuckyDivision ld = new LuckyDivision();
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     int count = 0;
//     if(num%4 == 0 || num%7 == 0){
//       System.out.println("YES");
//       return;
//     }
//     int len = ld.countlen(num);
//     while(count <= len){
//       if(num%10 == 4 || num%10 == 7){
//         num /= 10;
//         count++;
//       }else{
//         System.out.println("NO");
//         return;
//       }
//     }
//     System.out.println("YES");
//   }
//
//   public int countlen(int num){
//     int count = 0;
//     while(num >0){
//       num /= 10;
//       count++;
//     }
//     return count;
//   }
// }
