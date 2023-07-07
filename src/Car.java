/**
 * Represents a car, a type of vehicle,
 * with horsepower information
 */
public class Car extends Vehicle {
    private final int horsepower;

    /**
     * creates a car object with the specified type, year, and horsepower.
     * @param type the type of car
     * @param year the manufacturing year of the car
     * @param horsepower the horsepower of the car
     */
    public Car(String type, int year, int horsepower) {
        super(type, year);
        this.horsepower = horsepower;
    }

    /**
     * gets the horsepower of the car
     *
     * @return the horse of th car
     */
    public int getHorsepower() {
        return horsepower;
    }
}