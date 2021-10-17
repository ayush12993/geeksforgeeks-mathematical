package reverse;

import java.util.Scanner;

public class reversethedigits {
    /*
    * Given N,  reverse the digits of N.


Example 1:

Input: 200
Output: 2
Explanation: By reversing the digts of
number, number will change into 2.
Example 2:

Input : 122
Output: 221
Explanation: By reversing the digits of
number, number will change into 221.


Your Task:
You don't need to read or print anything. Your task is to complete the function reverse_digit() which takes N as input parameter and returns the reversed number.
    * */
    public static void main(String[] args) {
        int t=0,rev=0;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        System.out.println("Original number is "+t);
        while (t!=0){
            int rem = t%10;
            rev = rev * 10 + rem;
            t = t/10;
        }System.out.println("reverse is "+rev);
    }
}
