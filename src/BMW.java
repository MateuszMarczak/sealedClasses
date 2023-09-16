

/**
 * BMW class
 * Implements Car interface
 * Non-sealed class that can be extended
 */
non-sealed class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("Driving BMW");
    }
}
