import java.util.*;

public class exp1a {
    public static void main(String args[]) {
        System.out.println("Name: Nidhi Mhatre, S-13, 57");
        System.out.println("Name: Harshi Lodha, S-13, 55");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char v = sc.next().charAt(0);
        if (v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U' || v == 'a' || v == 'e' || v == 'i' ||
                v == 'o' || v == 'u') {
            System.out.println(v + " is a vowel");
        } else {
            System.out.println(v + " is not a vowel");
        }
    }
}