import java.util.*;

public class exp1b {
    public static void main(String args[]) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print(i + " ");
        }
    }
}