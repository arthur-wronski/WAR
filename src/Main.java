public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.initialiseGame();

        Deck playerOneDeck = game.getPlayerOneDeck();
        Deck playerTwoDeck = game.getPlayerTwoDeck();

        while (playerOneDeck.getDeckSize() > 0 && playerTwoDeck.getDeckSize() > 0){
            game.playRound();
        }

        if (playerOneDeck.getDeckSize() == 0){
            System.out.println("Player 2 wins the game!");
        } else if (playerTwoDeck.getDeckSize() == 0) {
            System.out.println("Player 1 wins");
        }
    }
}