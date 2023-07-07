/**
 * This represents a questions in the test game
 */
public interface Test {

    /**
     * Displays the question to the user
     */
    void displayQuestion();

    /**
     * check if the provided answer is correct
     * @param answer the user's answer
     * @return true if the answer is correct , false otherwise
     */
    boolean checkAnswer(String answer);
}
