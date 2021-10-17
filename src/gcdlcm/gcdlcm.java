package gcdlcm;


import java.util.Scanner;

public class gcdlcm {
    public static void main(String[] args) {
        int z,rem = 0,j,k,n=2,m=3,p=5,i;
        Scanner sc = new Scanner(System.in);
        j = sc.nextInt();
        k = sc.nextInt();
        int g= gcd(j,k);
        int lcm = (j*k)/g;
        System.out.println("GCD is = "+g+" LCM is "+lcm);
    }
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
