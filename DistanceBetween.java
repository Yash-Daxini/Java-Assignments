package assign1;
import java.util.*;
public class DistanceBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n1 = sc.nextInt();
        System.out.println("Enter number:");
        int n2 = sc.nextInt();

        int n = n1^n2;
        int count = 0;

        ArrayList<Integer> a = new ArrayList<>();

        while (n != 0) {
            a.add(n % 2);
            n = n/2;
        }

        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
