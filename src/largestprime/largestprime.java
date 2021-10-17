package largestprime;

import java.util.Scanner;

public class largestprime {
    public static void main(String[] args) {
        System.out.println(prime());

    }
    public static int prime (){
        int num,flag=2,j=2,n;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        if (num == 0 || num == 1){
            System.out.println("Number is not prime "+num);
        }
        else {
            if (num == j){
                System.out.println("It is prime "+num);
            }
            if (num % j == 0){
                System.out.println("It is not prime");
            }
        }
        j++;
        return prime();
    }
}
