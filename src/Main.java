public class Main {
    public static void main(String[] args) {
        String playerName = ""; // Set the player name

        Game game = new Game(playerName);
        game.addCar("Sedan", 2022, 250);
        game.addCar("Sports Car", 2021, 400);
        game.addCar("SUV", 2020, 300);
        game.addCar("Hatchback", 2019, 150);
        game.addCar("Convertible", 2018, 350);
        game.start();
    }
}