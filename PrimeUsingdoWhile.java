package assign1;

import java.util.*;

public class PrimeUsingdoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = sc.nextInt();
        System.out.println("Enter number:");
        int b = sc.nextInt();
        int i = a;
        int j = 2;
        int count=0;
        do {
            if(i == 2 && i == 1){
                i++;
            }
            else if (j <= i)
            {
                if (i % j == 0) {
                    count++;
                    j++;
                }
                else {
                    j++;
                }
            }
            else {
                if (count == 1) {
                    System.out.print(i + " ");
                    count = 0;
                    j=2;
                    i++;
                }
                else{
                    count = 0;
                    j=2;
                    i++;
                }
            }
        } while (i <= b);
    }
}
