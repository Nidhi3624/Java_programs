import java.util.*;

public class exp4b {
    exp4b(int x, int y) {
        System.out.println("Average of the two integers is:" + (x + y) / 2);
    }

    exp4b(float x, float y) {
        System.out.println("Average of the two floating point numbers is:" + (x +
                y) / 2);
    }

    exp4b(String x) {
        System.out.println("Average of strings is not possible.");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String e = sc.nextLine();
        System.out.println("Enter two integer numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter two floating point numbers:");
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        exp4b f = new exp4b(e);
        exp4b g = new exp4b(a, b);
        exp4b h = new exp4b(c, d);
    }
}
