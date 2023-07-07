
/**
 * This a main class to start the game and initialize cars
 *
 * @author Nafisa Emmanuel
 * @version 1.0
 * @see Game
 */
public class Main {
    /**
     * Main method to execute the game
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Game game = new Game();

        // Adding cars to the game

        game.addCar("Ferrari", 2022, 600);
        game.addCar("Sports Car", 2021, 350);
        game.addCar("SUV", 2020, 300);
        game.addCar("Hatchback", 2019, 150);
        game.addCar("Convertible", 2018, 400);

        //When game starts
        game.start();

    }
}
