public class Main {
    public static void main(String[] args) {
        Car wheel = new Car ("Lamborghini", "Aventador", 2011, 2000000);
        wheel.drive();
        Car wheel1 = new Car("Chevrolet", "Camaro", 2010, 8000000);
        wheel1.drive();
        Car wheel3 = new Car("SUV","SUZUKI Vitara", 2018, 72400);
        wheel3.drive();
        Car wheel2 = new Car("Škoda", "Octavia", 2010, 250000);
        wheel2.drive();
        Car wheel4 = new Car ( "Sedan", "Omoda S5", 2015, 700000);
        wheel4.drive();
        System.out.println("////////////////////////////");
        Sedan  wheels = new Sedan("Sedan", "Omoda S5", 2015, 70000, 125 );
        System.out.println(wheels.getTrunkCapacity());
        SUV car = new SUV("SUV","SUZUKI Vitara", 2018, 72400, "Yes" );
        System.out.println(car.getFourWheelDrive());


        }



        }

