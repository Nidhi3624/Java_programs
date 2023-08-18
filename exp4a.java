import java.util.*;

public class exp4a {
    void average(int x, int y) {
        System.out.println("Average of the two integers is:" + (x + y) / 2);
    }

    void average(float x, float y) {
        System.out.println("Average of the two floating point numbers is:" + (x +
                y) / 2);
    }

    void average(String x) {
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
        exp4a avg = new exp4a();
        avg.average(a, b);
        avg.average(c, d);
        avg.average(e);
    }
}
