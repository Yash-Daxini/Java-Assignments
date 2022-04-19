package assign1;

import java.util.*;

public class RomanToDecimanlVV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \n 1. To convert Decimal to Roman \n 2. To convert Roman to Decimal");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter number:");
                int n = sc.nextInt();
                String str = "";

                while (n != 0) {
                    if (n >= 1000) {
                        str += "M";
                        n -= 1000;
                    } else if (n >= 900 && n < 1000) {
                        str += "CM";
                        n -= 900;
                    } else if (n >= 500 && n < 900) {
                        str += "D";
                        n -= 500;
                    } else if (n >= 400 && n < 500) {
                        str += "CD";
                        n -= 400;
                    } else if (n >= 100 && n < 400) {
                        str += "C";
                        n -= 100;
                    } else if (n >= 90 && n < 100) {
                        str += "XC";
                        n -= 90;
                    } else if (n >= 50 && n < 90) {
                        str += "L";
                        n -= 50;
                    } else if (n >= 40 && n < 50) {
                        str += "XL";
                        n -= 40;
                    } else if (n >= 10 && n < 40) {
                        str += "X";
                        n -= 10;
                    } else if (n >= 9 && n < 10) {
                        str += "IX";
                        n -= 9;
                    } else if (n >= 5 && n < 9) {
                        str += "V";
                        n -= 5;
                    } else if (n >= 4 && n < 5) {
                        str += "IV";
                        n -= 4;
                    } else if (n >= 1 && n < 4) {
                        str += "I";
                        n -= 1;
                    }
                }
                System.out.println(str);
                break;
            case 2:
                System.out.println("Enter String Of Roman Number:");
                String s = sc.next();
                // System.out.println(s.length());
                int ans = 0;
                int i = 0;
                int j = i + 1;
                

                int i1 = 0;
                int j1 = 0;
                j1 = i1 + 2;
                

                // System.out.println(ans);
                break;

            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
}