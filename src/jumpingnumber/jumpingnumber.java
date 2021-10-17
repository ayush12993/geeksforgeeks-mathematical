package jumpingnumber;

import java.util.Scanner;

public class jumpingnumber {
    /*
    * Given a positive number X. Find the largest Jumping Number smaller than or equal to X.
Jumping Number: A number is called Jumping Number if all adjacent digits in it differ by only 1. All single digit numbers are considered as Jumping Numbers. For example 7, 8987 and 4343456 are Jumping numbers but 796 and 89098 are not.



Example 1:

Input:
X = 10
Output:
10
Explanation:
10 is the largest Jumping Number
possible for X = 10.
Example 2:

Input:
X = 50
Output:
45
Explanation:
45 is the largest Jumping Number
possible for X = 50.


Your Task:
You don't need to read input or print anything. Your task is to complete the function jumpingNums() which takes an Integer X as input and returns the largest Jumping Number less than or equal to X.
    * */
    public static void main(String[] args) {
        int b=0,h=0,j,z,diff=0,x=1,y=-1,n=1;
        Scanner sc = new Scanner(System.in);
        j = sc.nextInt();
        String number = String.valueOf(j);
        String[] digits = number.split("(?<=.)");
        for (int i=1;i<digits.length;i++){
            h = Integer.parseInt((digits[i]));
            int g = Integer.parseInt((digits[i-n]));
            diff = g-h;
            if (diff <4){
            if (diff == x || diff == y){
                System.out.println("Yup! "+number+" is a jumping number.");
            }else{
                System.out.println("no its not "+number);
            }
                System.out.println("Checked!");
            }else {
                System.out.println("No");
            }}}}