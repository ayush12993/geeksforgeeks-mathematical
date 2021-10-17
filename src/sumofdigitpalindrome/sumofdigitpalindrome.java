package sumofdigitpalindrome;

import java.util.Scanner;

public class sumofdigitpalindrome {
 /*
 * Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.

Example 1:

Input:
N=56
Output:
1
Explanation:
The digit sum of 56 is 5+6=11.
Since, 11 is a palindrome number.Thus,
answer is 1.
Example 2:

Input:
N=98
Output:
0
Explanation:
The digit sum of 98 is 9+8=17.
Since 17 is not a palindrome,thus, answer
is 0.

Your Task:
You don't need to read input or print aything.Your Task is to complete the function isDigitSumPalindrome() which takes a number N as input parameter and returns 1 if the Digit sum of N is a palindrome.Otherwise it returns 0.
 * */
    public static void main(String[] args) {
        int x,sum=0,rev=0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        String number = String.valueOf(x);
        String[] digits = number.split("(?<=.)");

        for (int i=0;i<digits.length;i++){
            int s = Integer.parseInt(digits[i]);
            //System.out.println(digits[i]);
            sum=sum+s;
    }
        System.out.println("original is "+sum);
        int t=sum;
        while (t!=0){
            int rem = t%10;
            rev = rev * 10 + rem;
            t = t/10;
        }
        System.out.println("reverse is "+rev);
        if (sum == rev){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
