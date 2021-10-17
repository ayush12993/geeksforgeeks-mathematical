package addtwofractions;

import java.util.Scanner;
/*
* You are given four numbers num1, den1, num2, and den2. You need to find (num1/den1)+(num2/den2) and output the result in the form of (numx/denx).

Input Format:
The first line of input contains an integer T denoting the number of test cases . Then T test cases follow . Each test case contains four integers num1, den1, num2, den2 respectively .

Output Format:
For each test case, in a new line,  output will be the fraction in the form a/b where the fraction denotes the sum of the two given fractions in reduced form.

Your Task:
Since this is a function problem, you don't need to worry about the testcases. Your task is to complete the function addFraction  which adds the two fractions and prints the resulting fraction. The function takes four arguments num1, den1, num2, den2 where num1, num2 denotes the numerators of two fractions and den1, den2 denotes their denominators.

Constraints:
1 <= T <= 100
1 <= den1,den2,num1,num2 <= 1000

Example:
Input
1
1 500 2 500
Output
3/500

Explanation:
In above test case 1/500+2/500=3/500
* */
public class addtwofractions {
    public static void main(String[] args) {
        int d0,d1,n0,n1;
        Scanner sc = new Scanner(System.in);
        n0=sc.nextInt();
        d0=sc.nextInt();
        n1=sc.nextInt();
        d1=sc.nextInt();
        System.out.println(fraction(n0,d0,n1,d1));
    }
    public static String fraction(int num0, int den0, int num1, int den1){
        int j=gcd(den0,den1);
        int lcm = den0*den1/j;
        int k = (lcm/den1)*num0;
        int l = (lcm/den0)*num1;
        return ((k+l)+"/"+lcm);
    }
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, b);
    }
}
