package UPSKILLING.MODULE_3.CORE_JAVA;

public class Q17_CLASS_OBJECT_CREATION {
    static class Car {
        String make;
        String model;
        int year;

        Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        void displayDetails() {
            System.out.println("Car: " + make + " " + model + " (" + year + ")");
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2022);
        Car car2 = new Car("Honda", "Civic", 2023);
        car1.displayDetails();
        car2.displayDetails();
    }
}
