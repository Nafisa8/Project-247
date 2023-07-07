public class Car extends Vehicle {
    private int horsepower;

    public Car(String type, int year, int horsepower) {
        super(type, year);
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }
}