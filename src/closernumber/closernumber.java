package closernumber;

import java.util.Scanner;

public class closernumber {
    /*
    * Given non-zero two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.



Example 1:

Input:
N = 13 , M = 4
Output:
12
Explanation:
12 is the Closest Number to
13 which is divisible by 4.
Example 2:

Input:
N = -15 , M = 6
Output:
-18
Explanation:
-12 and -18 are both similarly close to
-15 and divisible by 6. but -18 has
the maximum absolute value.
So, Output is -18


Your Task:
You don't need to read input or print anything. Your task is to complete the function closestNumber() which takes an Integer n as input and returns the answer.
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for closest - ");
        int N = sc.nextInt();
        System.out.println("Enter the number to divide - ");
        int M = sc.nextInt();
        int z = M+N;
        int q = N-M;
        for (int i = z;i>q;i--){
        if (i%M == 0 && i>q && i<z){
            System.out.println(i);
            break;
        }
    }}
}
