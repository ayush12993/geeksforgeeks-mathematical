package table;

import java.util.Scanner;

public class table {
    /*
    * Example 1:

Input:
N = 9

Output:
9 18 27 36 45 54 63 72 81 90

Explanation:
The table of 9 is the output whose 1st
term is 9 and the 10th term is 90.

Example 2:

Input:
N = 2

Output:
2 4 6 8 10 12 14 16 18 20

    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(i*x);
        }
    }
}
