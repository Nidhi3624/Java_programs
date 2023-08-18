//use the buffer reader class and take 3 inputs and display the output as average

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exp2a {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(reader);

        System.out.println("Enter marks of Physics:");
        int Phy = Integer.parseInt(read.readLine());

        System.out.println("Enter marks of Chemistry:");
        float Chem = Float.parseFloat(read.readLine());

        System.out.println("Enter marks of Maths:");
        int Maths = Integer.parseInt(read.readLine());

        float Average = (Maths + Chem + Phy) / 3;
        System.out.println("Average is:" + Average);
    }

}
