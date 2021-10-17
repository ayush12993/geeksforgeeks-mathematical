package gcdofarray;

import java.util.Scanner;

public class gcdofarray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("The number of elements you wants to store- ");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of array - ");
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("GCD of array elements are - ");
        for (int i=1;i<n;i++){
            System.out.println(gcd(array[i],array[i-1]));break;
        }
    }
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, b);
    }
}
