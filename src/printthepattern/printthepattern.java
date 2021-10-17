package printthepattern;
import java.util.Scanner;
public class printthepattern {
    public static void main(String[] args) {
        /*
        Example 1:

Input: 2
Output:
2 2 1 1 $2 1 $

Example 2:

Input: 3
Output:
3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $
        * */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i=x;i>=1;i--){
            for (int z=i;z>=1;z--) {
                System.out.println(z);
        }

        }
    }
}