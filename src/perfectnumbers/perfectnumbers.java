package perfectnumbers;

import java.util.Scanner;

public class perfectnumbers {
    public static void main(String[] args) {
        int n,i,z,temp=0,l;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i=n;i>0;i--){
            z=n%i;
            if (z==0){
                System.out.println(i);
                temp = temp+i;
        }} l=temp-n;
        System.out.println(l);
        if (l==n){
            System.out.println(1+" Yup it,s a perfect number");
        }else {
            System.out.println(0+" No it,s not a perfect number");
        }

    }}