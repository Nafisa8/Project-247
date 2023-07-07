import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


/**
 * Game class represents a game application
 * that asks questions and assigns cars based on the user's score.
 */
public class Game implements Test {
    private final List<Car> cars;
    private final Scanner scanner;

    /**
     * Constructs a Game object with an
     * empty list of cars and initializes the scanner.
     */
    public Game() {
        this.cars = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Adds a car to the list of cars.
     *
     * @param type       the type of the car
     * @param year       the year of the car
     * @param horsepower the horsepower of the car
     */
    public void addCar(String type, int year, int horsepower) {
        Car car = new Car(type, year, horsepower);
        cars.add(car);
    }

    /**
     * Starts the game by displaying welcome message
     * listing available cars to win
     * ask user questions
     * assign them based on user's scores
     */

    public void start() {

        /**
         *prompt the user to enter their name,
         * displays available cars, start the test
         * and assigns a car based on the user's score
         *
         */

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        System.out.println("Welcome, " + playerName + "!");
        System.out.println("Here are the 5 cars you can get based on your test score:");

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println("Car " + (i + 1) + ": " + car.getType() + ", Year: " + car.getYear());
        }

        System.out.println("\nTest Time!");


        Test[] tests = {
                new PlanetQuestion(),
                new USAFlagQuestion(),
                new WaterOxygenQuestion(),
                new HeptadecagonQuestion(),
                new ContinentsQuestion()
        };

        int correctAnswers = 0;


        for (Test test : tests) {
            test.displayQuestion();
            String answer = scanner.nextLine();


            if (test.checkAnswer(answer)) {
                correctAnswers++;
            } else {
                System.out.println("Incorrect answer.");
            }
        }

        System.out.println("\nResults:");
        System.out.println("You got " + correctAnswers + " out of 5 answers correct.");


        Car car;
        if (correctAnswers == 1) {
            System.out.println("Oopsie. You get the slowest car!");
            car = cars.get(3); // Hatchback 2019 150
        } else if (correctAnswers == 2) {
            System.out.println("Not bad. You get the second slowest car!");
            car = cars.get(2); // SUV 2020 300
        } else if (correctAnswers == 3) {
            System.out.println("You did good. You get an average car!");
            car = cars.get(1); // Sports Car 2021 350
        } else if (correctAnswers == 4) {
            System.out.println("Excellent work. You get the second fastest car!");
            car = cars.get(4); // Convertible 2018 400
        } else if (correctAnswers == 5) {
            System.out.println("VROOM VROOM. You get the fastest car!");
            car = cars.get(0); // Ferrari 2022 600
        } else {
            System.out.println("Better luck next time!");
            return;
        }

        System.out.println("Car: " + car.getType() + ", Year: " + car.getYear() +
                ", Horsepower: " + car.getHorsepower());
    }


    @Override
    public void displayQuestion() {
        /**
         * This method is implemented from the Test interface
         * Display the question
         */
    }

    @Override
    public boolean checkAnswer(String answer) {
        /**
         * check if the provided answer is correct
         * this method is implemented from the Test interface
         * @param answer the user's answer
         * @return true if the answer is correct , false otherwise
         */
        return false;
    }
}

class PlanetQuestion implements Test {
    @Override
    public void displayQuestion() {
        /**
         * displays the question
         */
        System.out.println("How many planets are there in space?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        /**
         *
         * checks if the answer is correct
         *
         * @param answer the user's answer
         * @return true if the answer is correct (equals "8"), false otherwise
         */
        return answer.equals("8");
    }
}

class USAFlagQuestion implements Test {
    @Override
    public void displayQuestion() {
        /**
         * displays the question
         */
        System.out.println("How many stars are on the USA flag?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        /**
         *
         * checks if the answer is correct
         *
         * @param answer the user's answer
         * @return true if the answer is correct (equals "50"), false otherwise
         */
        return answer.equals("50");
    }
}

class WaterOxygenQuestion implements Test {
    @Override
    public void displayQuestion() {
        /**
         * displays the question
         */
        System.out.println("How much oxygen does water have?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        /**
         *
         * checks if the answer is correct
         *
         * @param answer the user's answer
         * @return true if the answer is correct (equals "2"), false otherwise
         */
        return answer.equals("2");
    }
}

class HeptadecagonQuestion implements Test {
    @Override
    public void displayQuestion() {
        /**
         * displays the question
         */
        System.out.println("How many sides does a heptadecagon have?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        /**
         *
         * checks if the answer is correct
         *
         * @param answer the user's answer
         * @return true if the answer is correct (equals "17"), false otherwise
         */
        return answer.equals("17");
    }
}

class ContinentsQuestion implements Test {
    @Override
    public void displayQuestion() {
        /**
         * displays the question
         */
        System.out.println("How many continents are there?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        /**
         *
         * checks if the answer is correct
         *
         * @param answer the user's answer
         * @return true if the answer is correct (equals "7"), false otherwise
         */
        return answer.equals("7");
    }
}
