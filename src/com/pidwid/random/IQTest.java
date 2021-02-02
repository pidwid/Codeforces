package com.pidwid.random;
import java.util.*;

// 25A - IQ test
public class IQTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalNum = sc.nextInt();
    int evenIndex = -1, oddIndex = -1;
    int evenCount = 0, oddCount = 0;
    for(int i = 1; i<= totalNum; i++){
      int num = sc.nextInt();
      if(num % 2 == 0){
        if(evenCount == 0) evenIndex = i;
        evenCount++;
      }else{
        if(oddCount == 0) oddIndex = i;
        oddCount++;
      }
    }
    if(evenCount < oddCount) System.out.println(evenIndex);
    else System.out.println(oddIndex);

  }

}
