package armstrongnumber;

import java.util.Scanner;

public class armstrongnumber {
    /*
    * For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371

Example 1:

Input: N = 153
Output: "Yes"
Explanation: 153 is an Armstrong number
since 13 + 53 + 33 = 153.
Hence answer is "Yes".
Example 2:

Input: N = 370
Output: "Yes"
Explanation: 370 is an Armstrong number
since 33 + 73 + 03 = 370.
Hence answer is "Yes".

Your Task:
You dont need to read input or print anything. Complete the function armstrongNumber() which takes n as input parameter and returns "Yes" if it is a armstrong number else returns "No"..
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String number = String.valueOf(num);
        String[] digits = number.split("(?<=.)");
        int q = 0,sum = 0;
        for (int i=0;i<digits.length;i++){
            int s = Integer.parseInt(digits[i]);
                 q = (int) Math.pow(s,number.length());
          //  System.out.println(q + "+");
                 sum = sum+q;
        }
        //System.out.println(sum);
        if (sum == num){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
