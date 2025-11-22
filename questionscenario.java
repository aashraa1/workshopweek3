import java.util.Scanner;

/**
 * Write a description of class questionscenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class questionscenario
{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fixed rates (you can change these if your teacher gave different values)
        double baseFare = 50;          // Rs. 50
        double perKm = 20;             // Rs. 20 per km
        double perMinute = 2;          // Rs. 2 per minute
        double localDiscountRate = 0.10; // 10% discount for locals
        double nightSurchargeRate = 0.20; // 20% extra at night

        // ----- INPUTS -----
        System.out.print("Enter distance travelled (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter travel time (in minutes): ");
        int minutes = sc.nextInt();

        System.out.print("Is the customer a local? (yes/no): ");
        String isLocal = sc.next().toLowerCase();

        System.out.print("Is this night-time travel? (yes/no): ");
        String isNight = sc.next().toLowerCase();

        // ----- CALCULATION -----
        double fare = baseFare + (distance * perKm) + (minutes * perMinute);

        // Apply local discount
        fare = isLocal.equals("yes") ? fare * (1 - localDiscountRate) : fare;

        // Apply night-time surcharge
        fare = isNight.equals("yes") ? fare * (1 + nightSurchargeRate) : fare;

        // ----- OUTPUT -----
        System.out.println("Total Fare: Rs. " + fare);
    }
}

