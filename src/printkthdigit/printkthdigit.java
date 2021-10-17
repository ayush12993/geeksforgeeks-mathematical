package printkthdigit;

import java.util.Scanner;

public class printkthdigit {
    /*
    * Given two numbers A and B, find Kth digit from right of AB.


Example 1:

Input:
A = 3
B = 3
K = 1
Output:
7
Explanation:
33 = 27 and 1st
digit from right is
7
Example 2:

Input:
A = 5
B = 2
K = 2
Output:
2
Explanation:
52 = 25 and second
digit from right is
2.

Your Task:
You don't need to read input or print anything. Your task is to complete the function kthDigit() which takes integers A, B, K as input parameters and returns Kth Digit of AB from right side.
    * */
    public static void main(String[] args) {
        int t=0,s=0,rev=0,f=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number is ");
        t = sc.nextInt();
        System.out.println("Cube number is ");
        s = sc.nextInt();
        int z = (int) Math.pow(t,s);

        String number = String.valueOf(z);
        String[] digits = number.split("(?<=.)");
        System.out.println("Enter kth position: ");
        int k = sc.nextInt();
        for (int i= digits.length;i>0;i--) {
            f = Integer.parseInt(digits[k]);
        }
        System.out.println("Element at Kth position from right is: "+f);
}}
