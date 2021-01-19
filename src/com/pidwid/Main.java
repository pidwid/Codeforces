package com.pidwid;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println( m.factZero(20));
        System.out.println(m.efficientApproach(251));
    }

    public int factZero(int n){
        int fact = 1;
        for (int i = 2; i<= n; i++){
            fact *= i;
        }
        int count = 0;
        while(fact % 10 == 0){
            fact /= 10;
            count++;
        }
        return count;
    }

    public int efficientApproach(int n){
        int res = 0;
        for(int i = 5; i <=n ; i*=5){
            res += n/i;
        }
        return res;
    }
    // public int efficientApproach(int n){
    //     int res = 0;
    //     while(n > 0){
    //         res += n/5;
    //         n /= 5;
    //     }
    //     return res;
    // }
}
