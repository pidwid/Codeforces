package com.pidwid.asoj.div1;
import java.util.Scanner;

// 112A - Petya and Strings
public class PetyaAndStrings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] arr = new String[2];
    for (int i = 0; i < 2; i++) {
      arr[i] = input.nextLine();
    }
    //int length = arr[0].length();
    String text1 = arr[0].toLowerCase();
    String text2 = arr[1].toLowerCase();
    if (text1.compareTo(text2) == 0) {
      System.out.println("0");
    }
    if (text1.compareTo(text2) > 0) {
      System.out.println("1");
    }
    if (text1.compareTo(text2) < 0) {
      System.out.println("-1");
    }
  }
}
// bwuEhEveouaTECagLZiqmUdxEmhRSOzMauJRWLQMppZOumxhAmwuGeDIkvkBLvMXwUoFmpAfDprBcFtEwOULcZWRQhcTbTbX
// HhoDWbcxwiMnCNexOsKsujLiSGcLllXOkRSbnOzThAjnnliLYFFmsYkOfpTxRNEfBsoUHfoLTiqAINRPxWRqrTJhgfkKcDOH

