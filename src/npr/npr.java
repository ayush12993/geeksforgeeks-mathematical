package npr;

import java.util.Scanner;

public class npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact=1,fact1=1;
        int n = sc.nextInt();
        int r = sc.nextInt();
        for (int i=n;i>0;i--){
            fact = fact*i;
        }
        System.out.println(fact);
        for (int i=n-r;i>0;i--){
            fact1 = fact1*i;
        }
        System.out.println(fact1);
        int npr= fact/fact1;
        System.out.println("npr value is "+npr);
    }
}
