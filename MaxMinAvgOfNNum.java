package assign1;

import java.util.*;

public class MaxMinAvgOfNNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of numbers:");
        int n = sc.nextInt();
        int a=0;
        int sum = 0;
        int max=0;
        boolean flag = false;
        int min=0;
        System.out.println("\tEnter " + n + " Numbers:");
        for (int i = 1; i <= n; i++) {
            a = sc.nextInt();
            if(!flag){
                min=a;
                flag = true;
            }
            if(max < a){
                max = a;
            }
            if(min > a){
                min = a;
            }
            sum = sum + a;
        }
        System.out.println("Sum of "+ n + " Numbers = " + sum);
        System.out.println("Average of "+ n + " Numbers = " + sum/n);
        System.out.println("Maximum Number from "+ n + " Numbers = " + max);
        System.out.println("Minimum Number from "+ n + " Numbers = " + min);
        
    }
    
}
