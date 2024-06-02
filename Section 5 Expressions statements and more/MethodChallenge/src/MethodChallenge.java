public class MethodChallenge {
    public static void main(String[] args) {
        // challenge one
        displayHighScorePosition("Challenge One", 1);

        // challenge two
        displayHighScorePosition("Player One", calculateHighScorePosition(1500));
        displayHighScorePosition("Player Two", calculateHighScorePosition(1000));
        displayHighScorePosition("Player Three", calculateHighScorePosition(500));
        displayHighScorePosition("Player Four", calculateHighScorePosition(100));
        displayHighScorePosition("Player Five", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {

        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
