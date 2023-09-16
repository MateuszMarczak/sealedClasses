/**
 * Audi is a sealed class that permits A3.
 * that means A3 can extend Audi, but no other class can extend Audi.
 * Audi implements Car interface.
 */
sealed class Audi implements Car permits A3 {
    @Override
    public void drive() {
        System.out.println("Driving Audi");
    }
}
