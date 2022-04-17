package assign1;

import java.util.*;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();

        while (n != 0) {
            a.add(n % 2);
            n = n/2;
        }

        for (int i = a.size()-1; i >= 0; i--) {
            System.out.print(a.get(i));
        }
    }

}
