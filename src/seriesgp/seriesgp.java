package seriesgp;

import java.util.Scanner;

public class seriesgp {
    /*
    * Given the A and R i,e first term and common ratio of a GP series. Find the Nth term of the series.


Example 1:

Input: A = 2, R = 2, N = 4
Output: 16
Explanation: The GP series is
2, 4, 8, 16, 32,... in which 16
is th 4th term.
Example 2:

Input: A = 4, R = 3, N = 3
Output: 36
Explanation: The GP series is
4, 12, 36, 108,.. in which 36 is
the 3rd term.


Your Task:
You don't need to read or print anything. Your task is to complete the function Nth_term() which takes A, R and N as input parameter ans returns Nth term of the GP series modulo 109 + 7.
    * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a1 - ");
        int a1 = sc.nextInt();
        System.out.println("Enter a2 - ");
        int a2 = sc.nextInt();
        System.out.println("Enter index range - ");
        int x = sc.nextInt();
        double r = a2/a1;
        int arr[] = new int[x];
        for (int n=0;n<x;n++){
            int z = (int) (a1 * Math.pow(r,n-1));
            arr[n] = z;
            //System.out.println(arr[n]);
        }
        System.out.println(arr[1]);//change 5 to n for all
    }
}
