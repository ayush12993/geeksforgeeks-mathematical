package seriesap;

import java.util.Scanner;

public class seriesap {
    /*
    * Given the first 2 terms A1 and A2 of an Arithmetic Series.Find the Nth term of the series.

Example 1:

Input:
A1=2
A2=3
N=4
Output:
5
Explanation:
The series is 2,3,4,5,6....
Thus,4th term is 5.
Example 2:

Input:
A1=1
A2=2
N=10
Output:
10
Explanation:
The series is1,2,3,4,5,6,7,8,9,10,11..
Thus,10th term is 10.

    * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a1 - ");
        int a1 = sc.nextInt();
        System.out.println("Enter a2 - ");
        int a2 = sc.nextInt();
        System.out.println("Enter index range - ");
        int x = sc.nextInt();
        int arr[] = new int[x];
        for (int n=0;n<x;n++){
         int z = a1 + (n-1)*(a2-a1);
            arr[n] = z;
    }
        System.out.println(arr[1]);//change 5 to n for all
    }
}
