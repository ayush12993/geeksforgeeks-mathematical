package gcd;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        int z,rem = 0,j,k,n=2,m=3,p=5,i;
        Scanner sc = new Scanner(System.in);
        j = sc.nextInt();
        k = sc.nextInt();
           int g=    gcd(j,k);
        System.out.println(g);
    }
public static int gcd(int a, int b) {
    if (a == 0) {
        return b;
    }
    return gcd(b % a, b);
}
}