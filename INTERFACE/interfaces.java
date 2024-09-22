// import java.util.Scanner;
// public class interfaces {
//     public static void main(String[] args) {
//         Car c1 = new Car();
//         Bike b1 = new Bike();
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter gear for Car: ");
//         int n1 = sc.nextInt(); // Gear for Car
//         System.out.print("Enter speed to increase for Car: ");
//         int n2 = sc.nextInt(); // Speed increase for Car
//         System.out.print("Enter speed to decrease for Car: ");
//         int n3 = sc.nextInt(); // Speed decrease for Car

//         c1.changeGear(n1);
//         c1.speedUp(n2);
//         c1.applyBrakes(n3);

//         // Display the speed of the car
//         System.out.println("Car speed: " + c1);

//         // Additional input for Bike
//         System.out.print("Enter gear for Bike: ");
//         int m1 = sc.nextInt(); // Gear for Bike
//         System.out.print("Enter speed to increase for Bike: ");
//         int m2 = sc.nextInt(); // Speed increase for Bike
//         System.out.print("Enter speed to decrease for Bike: ");
//         int m3 = sc.nextInt(); // Speed decrease for Bike

//         b1.changeGear(m1);
//         b1.speedUp(m2);
//         b1.applyBrakes(m3);

//         // Display the speed of the bike
//         System.out.println("Bike speed: " + b1);

//         sc.close(); // Close the scanner
//     }
// }

// interface Vehicle {
//     void changeGear(int a);
//     void speedUp(int a);
//     void applyBrakes(int a);
// }

// class Car implements Vehicle {
//     int gear;
//     int speed;

//     @Override
//     public void changeGear(int a) {
//         gear = a;
//     }

//     @Override
//     public void speedUp(int a) {
//         speed += a;
//     }

//     @Override
//     public void applyBrakes(int a) {
//         speed -= a;
//         if (speed < 0) {
//             speed = 0; // Ensure speed doesn't go negative
//         }
//     }

//     @Override
//     public String toString() {
//         return speed + "kmph";
//     }
// }

// class Bike implements Vehicle {
//     int gear;
//     int speed;

//     @Override
//     public void changeGear(int a) {
//         gear = a;
//     }

//     @Override
//     public void speedUp(int a) {
//         speed += a;
//     }

//     @Override
//     public void applyBrakes(int a) {
//         speed -= a;
//         if (speed < 0) {
//             speed = 0; // Ensure speed doesn't go negative
//         }
//     }

//     @Override
//     public String toString() {
//         return speed + "kmph";
//     }
// }



import java.util.Scanner;

public class Interfaces {
    public static void main(String[] args) {
        Car c1 = new Car(); // Car object creation
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // Gear for Car
        int n2 = sc.nextInt(); // Speed increase for Car
        int n3 = sc.nextInt(); // Speed decrease for Car

        c1.changeGear(n1);
        c1.speedUp(n2);
        c1.applyBrakes(n3);
        System.out.println("Car speed: " + c1);
    }
}

interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Car implements Vehicle {
    int gear;
    int speed;
    @Override
    public void changeGear(int a) {
        gear = a;
    }
    @Override
    public void speedUp(int a) {
        speed += a;
    }
    @Override
    public void applyBrakes(int a) {
        speed -= a;
        if (speed < 0) {
            speed = 0; // Ensure speed doesn't go negative
        }
    }
    @Override
    public String toString() {
        return speed + "kmph";
    }
}
