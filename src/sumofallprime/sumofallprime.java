package sumofallprime;

import java.util.Scanner;

public class sumofallprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primesum(n);
    }
    static void primesum(int n){
        int p,j = 0;
        boolean prime[] = new boolean[n+1];
        for (int i=0;i<=n;i++) {
            prime[i] = true;
        }
        for (p=2;p*p<=n;p++){
            if (prime[p] = true){
                for (int i=p*p;i<=n;i+=p){
                    prime[i]=false;
                }}
        }
        for (int i=2;i<=n;i++){
            if (prime[i] == true){
                j=j+i;
            }
        }
        System.out.println(j+" is sum of all prime.");
    }
}
