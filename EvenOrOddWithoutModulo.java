package assign1;

import  java.util.Scanner;

class  EvenOrOddWithoutModulo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();

        if((n/2.0) > (n / 2)){
            System.out.println("odd");
        }
        else
            System.out.println("even");
    }
}