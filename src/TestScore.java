public class TestScore {
    public static void main(String[] args) {
        Score player1 = new Score();
        Score player2 = new Score("Ali");
        Score player3 = new Score("Ahmed");

        System.out.println();
        player1.display();
        player2.display();
        player3.display();

        System.out.println();
        player1.setPlayerName("Khaled");
        player1.setCurrentScore(45);

        player2.addPoints(30);
        player2.addPoints(85);

        player3.setCurrentScore(-20);
        player3.setMaxScore(200);
        player3.addPoints(150);

        System.out.println();
        player1.display();
        player2.display();
        player3.display();
    }
}
