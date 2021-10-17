package binarytodecimal;

import java.util.Scanner;

public class binarytodecimal {
    /**
     *Given a Binary Number B, find its decimal equivalent.
     *
     *
     * Example 1:
     *
     * Input: B = 10001000
     * Output: 136
     * Example 2:
     *
     * Input: B = 101100
     * Output: 44
     *
     *
     * Your Task:
     * You don't need to read or print anything. Your task is to complete the function binary_to_decimal() which takes the binary number as string input parameter and returns its decimal equivalent.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number - ");
        int x = sc.nextInt();
        System.out.println("Decimal number is: "+getdecimal(x));
    }

    public static int getdecimal(int binary){
        int decimal = 0;
        int n = 0;
        while (true){
            if (binary == 0){
                break;
            }else {
                int temp = binary % 10;
                decimal += temp*Math.pow(2,n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }
}
