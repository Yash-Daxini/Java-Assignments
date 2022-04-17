package assign1;

import  java.util.Scanner;
public class DivisonOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = sc.nextInt();
        System.out.println("Enter any number:");
        int b = sc.nextInt();
        int i=0;
        int j=a;
        int q=0;
        int r=0;
        boolean flag = false;
        while(i>=0 && i<=a){
            if(a == b*i){
                System.out.println(i + " " + "0");
                i++;
                flag =false;
                break;
            }
            else if(a >= b*i && j >= 1){
                j = a - b*i;
                q = i;
                r = j;
                flag = true;
                i++;
            }
            else{
                i++;
            }
        }
        if(flag){
            System.out.println(q + " " + r);
        }
    }
    
}
