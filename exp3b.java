
//WAP to read and display two different classes with different parameters
import java.util.Scanner;

class location {
    String continent, country, city;
    String type;
    int temp;

    void readLocation() {
        Scanner loc = new Scanner(System.in);
        System.out.println("Enter Continent name:");
        continent = loc.nextLine();
        System.out.println("Enter Country name:");
        country = loc.nextLine();
        System.out.println("Enter City name:");
        city = loc.nextLine();
    }

    void displayLocation() {
        System.out.println("Continent name : " + continent);
        System.out.println("Country name : " + country);
        System.out.println("City Name " + city);
    }
}

public class exp3b {
    String type;
    int temp;

    void readWeather() {
        Scanner wt = new Scanner(System.in);
        System.out.println("Enter Weather Type:");
        type = wt.nextLine();
        System.out.println("Enter Temperature:");
        temp = wt.nextInt();
    }

    void displayWeather() {
        System.out.println("Weather Type:" + type);
        System.out.println("Temperature : " + temp);
    }

    public static void main(String args[]) {
        System.out.println(" ");
        location sc = new location();
        exp3b ob = new exp3b();
        sc.readLocation();
        System.out.println(" ");
        ob.readWeather();
        System.out.println(" ");
        sc.displayLocation();
        System.out.println(" ");
        ob.displayWeather();
    }
}
