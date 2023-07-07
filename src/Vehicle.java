public abstract class Vehicle {
    private String type;
    private int year;

    public Vehicle(String type, int year) {
        this.type = type;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }
}