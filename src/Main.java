public class Main {

    static void driveCar(Car car) {
        switch (car) {
            case BMW bmw -> bmw.drive();
            // A3 have to be here, because it is a subclass of Audi
            case A3 a3 -> a3.drive();
            case Audi audi -> audi.drive();
            case Mercedes mercedes -> mercedes.drive();
        }
    }

    public static void main(String[] args) {

        // Get all classes that are permitted to extend Car
        var permittedSubclasses = Car.class.getPermittedSubclasses();
        for (Class<?> subclass : permittedSubclasses) {
            System.out.println(subclass.getName());
        }
        System.out.println("----------------------");

        Car bmw = new BMW();
        Car audi = new Audi();
        Car a3 = new A3();
        Car mercedes = new Mercedes();
        driveCar(bmw);
        driveCar(audi);
        driveCar(a3);
        driveCar(mercedes);

    }
}