package factorial;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact=1;
        int s =sc.nextInt();
        for (int i=s;i>0;i--){
            fact = fact*i;
        }
        System.out.println(fact);
        }
}
