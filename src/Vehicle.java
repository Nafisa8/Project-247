/**
 * Represents a vehicle
 */
public abstract class Vehicle {
    private final String type;
    private final int year;

    /**
     * create a vehicle object with the specified type and year
     * @param type  type of vehicle
     * @param year  manufacturing year of the vehicle
     */
    public Vehicle(String type, int year) {
        this.type = type;
        this.year = year;
    }

    /**
     * gets the type of vehicle
     * @return the type of the vehicle
     */

    public String getType() {
        return type;
    }

    /**
     * gets the year of the vehicle
     * @return the manufacturing year of the vehicle
     */
    public int getYear() {
        return year;
    }
}