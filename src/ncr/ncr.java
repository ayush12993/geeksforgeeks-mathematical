package ncr;

import java.util.Scanner;

public class ncr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact=1,fact1=1,fact0=1;
        int n = sc.nextInt();
        int r = sc.nextInt();
        for (int i=n;i>0;i--){
            fact = fact*i;
        }
        System.out.println(fact);
        for (int i=r;i>0;i--){
            fact0 = fact0*i;
        }
        System.out.println(fact0);
        for (int i=n-r;i>0;i--){
            fact1 = fact1*i;
        }
        System.out.println(fact1);
        int ncr= fact/(fact1*fact0);
        System.out.println("ncr value is "+ncr);
    }
}
