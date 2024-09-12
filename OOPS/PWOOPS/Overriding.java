
class Plane {

    public void takeOff() {
        System.out.println("Plane take off");
    }

    public void fly() {
        System.out.println("Plane fly");
    }

    public void land() {
        System.out.println("Plane land");
    }
}

class Passenger_Plane extends Plane {

    @Override
    public void takeOff() {
        System.out.println("Passenger_Plane take off");
    }

    @Override
    public void fly() {
        System.out.println("Passenger_Plane fly");
    }

    @Override
    public void land() {
        System.out.println("Passenger_Plane land");
    }
}

class Cargo_Plane extends Plane {

    @Override
    public void takeOff() {
        System.out.println("Cargo_Plane take off");
    }

    @Override
    public void fly() {
        System.out.println("Cargo_Plane fly");
    }

    @Override
    public void land() {
        System.out.println("Cargo_Plane land");
    }
}

class Airport {

    public void Allowplane(Plane p) {
        p.takeOff();
        p.fly();
        p.land();
    }
}

public class Overriding {

    public static void main(String[] args) {
        Passenger_Plane p1 = new Passenger_Plane();
        Cargo_Plane c1 = new Cargo_Plane();
        Plane p = new Plane();  // Declare a plane object

        Airport a = new Airport();

        // Allow planes to perform their operations
        a.Allowplane(p1);  // Allow Passenger_Plane
        a.Allowplane(c1);  // Allow Cargo_Plane
        a.Allowplane(p);   // Allow regular Plane
    }
}
