
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Game implements Test {
    private List<Car> cars;
    private String playerName;
    private Test[] tests;
    private Scanner scanner;

    public Game(String playerName) {
        this.playerName = playerName;
        this.cars = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addCar(String type, int year, int horsepower) {
        Car car = new Car(type, year, horsepower);
        cars.add(car);
    }

    public void start() {
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        System.out.println("Welcome, " + playerName + "!");
        System.out.println("Here are the details of 5 cars:");

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println("Car " + (i + 1) + ": " + car.getType() + ", Year: " + car.getYear());
        }
        System.out.println("\nTest Time!");


        Test[] quizzes = {
                new PlanetQuestion(),
                new USAFlagQuestion(),
                new WaterOxygenQuestion(),
                new HeptadecagonQuestion(),
                new ContinentsQuestion()
        };

        int correctAnswers = 0;


        for (Test test : quizzes) {
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

        if (correctAnswers == 1) {
            System.out.println("Oopsie. You get the slowest car!");
            System.out.println("Car: " + cars.get(4).getType() + ", Year: " + cars.get(4).getYear());
        } else if (correctAnswers == 2) {
            System.out.println("Not bad. You get the second slowest car!");
            System.out.println("Car: " + cars.get(3).getType() + ", Year: " + cars.get(3).getYear());
        } else if (correctAnswers == 3) {
            System.out.println("You did good. You get an average car!");
            System.out.println("Car: " + cars.get(2).getType() + ", Year: " + cars.get(2).getYear());
        } else if (correctAnswers == 4) {
            System.out.println("Excellent work. You get the second fastest car!");
            System.out.println("Car: " + cars.get(1).getType() + ", Year: " + cars.get(1).getYear());
        } else if (correctAnswers == 5) {
            System.out.println("VROOM VROOM. You get the fastest car!");
            System.out.println("Car: " + cars.get(0).getType() + ", Year: " + cars.get(0).getYear());
        } else {
            System.out.println("Better luck next time!");
        }
    }




    @Override
    public void displayQuestion() {
        // This method is implemented from the Quiz interface
        // Display the question
    }

    @Override
    public boolean checkAnswer(String answer) {
        // This method is implemented from the Quiz interface
        // Check if the answer is correct and return true or false
        return false;
    }
}

class PlanetQuestion implements Test {
    @Override
    public void displayQuestion() {
        System.out.println("How many planets are there in space?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals("8");
    }
}

class USAFlagQuestion implements Test {
    @Override
    public void displayQuestion() {
        System.out.println("How many stars are on the USA flag?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals("50");
    }
}

class WaterOxygenQuestion implements Test {
    @Override
    public void displayQuestion() {
        System.out.println("How much oxygen does water have?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals("2");
    }
}

class HeptadecagonQuestion implements Test {
    @Override
    public void displayQuestion() {
        System.out.println("How many sides does a heptadecagon have?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals("17");
    }
}

class ContinentsQuestion implements Test {
    @Override
    public void displayQuestion() {
        System.out.println("How many continents are there?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals("7");
    }
}
