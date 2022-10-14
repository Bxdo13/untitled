package com.company;

public class Test1 {
    public static void main(String[] args) {
    }
    public static long fact(long number) {
        if (number == 1) {
            return 1;
        }
        if (number < 0) {
            number = Math.abs(number);

            return
                    -1 * (number * fact(number - 1));
        } else return number * fact(number - 1);
    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static String revStr(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return revStr(str.substring(1)) + str.charAt(0);
    }

    public static void countDown(int number) {
        if (number == 0)
            System.out.print(0);
        else {
            System.out.print(number + " ");
            countDown(number - 1);
        }
    }

    public static void reverseNum(int n) {
        if ((n < 10 && n>0) || (n<0 && n>-10)) {
            System.out.println(Math.abs(n));
            return;
        }
        else if(n<0 && n<-10) {
            System.out.print(n % 10);
            n=Math.abs(n);
            reverseNum(n / 10);
        }
        else{
            System.out.print(n % 10);
            reverseNum(n / 10);
        }
    }

    public static void digitsToWords(int number) {
        int n=number;
        int count=0;
        while(n>=10){
            n=n/10;
            ++count;
        }

        switch (n) {
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;
            case 0:
                System.out.print("zro ");
                break;
        }
        if (number >= 10) {
            int degree=1;
            for (int i = 1; i <=count ; i++) {
                degree*=10;
            }
            digitsToWords(number - (n *degree));
        }
    }
    public static int powerNum(int number,int power){
      if(power!=0){
          if(number<0 && power%2!=0){
              number=Math.abs(number);
              return -(number*(powerNum(number,power-1)));
          }
          else
          return number*(powerNum(number,power-1));
      }
      else {

          return 1;
      }
    }
    public static int decToBin(int n){
        if(n==0)
         return 0;
        else
            return (n%2+10*decToBin(n/2));
    }
}

