public class Score {

    private String playerName;
    private int currentScore;
    private int maxScore;

    public Score() {
        this.playerName = "unknown";
        this.currentScore = 0;
        this.maxScore = 100;
    }

    public Score(String playerName) {

        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {

        if (currentScore > maxScore) {
            this.currentScore = maxScore;

        } else if (currentScore < 0) {
            this.currentScore = 0;
        } else {
            this.currentScore = currentScore;
        }
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public void addPoints(int points) {
        setCurrentScore(this.currentScore + points);
    }

    public void display() {
        System.out.println("Player: " + playerName + " | Current Score: " + currentScore);
    }
}