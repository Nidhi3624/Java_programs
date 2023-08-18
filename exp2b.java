//Use scanner and take 3 inputs and print the output as the average of the 3

import java.util.Scanner;

public class exp2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks for Physics:");
        int Phy = sc.nextInt();

        System.out.println("Enter marks for Chemistry:");
        float Chem = sc.nextFloat();

        System.out.println("Enter marks for Maths:");
        int Maths = sc.nextInt();
        
        float Average = (Maths + Phy + Chem) / 3;
        System.out.println("Average is:" + Average);
    }
}
