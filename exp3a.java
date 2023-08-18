
/* WAP to read and display details of an employee using single class and
its object */
import java.io.*;
import java.util.Scanner;

public class exp3a {
    String name, branch;
    int rollno, marks;

    void read() {
        Scanner std = new Scanner(System.in);
        System.out.println("Enter Student name:");
        name = std.nextLine();
        System.out.println("Enter Roll no.:");
        rollno = std.nextInt();
        System.out.println("Enter Branch:");
        branch = std.nextLine();
        System.out.println("Enter Sem1 Marks:");
        marks = std.nextInt();
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll no. : " + rollno);
        System.out.println("Branch : " + branch);
        System.out.println("Sem1 Marks : " + marks);
    }

    public static void main(String args[]) {
        System.out.println(" ");
        exp3a sc = new exp3a();
        sc.read();
        System.out.println(" ");
        sc.display();
    }
}