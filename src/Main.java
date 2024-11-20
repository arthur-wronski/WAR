public class Main {
    public static void main(String[] args) {
        Deck startingDeck = new Deck();
        startingDeck.generateStartingDeck();

        Game game = new Game();
        game.distributeCards(startingDeck);

        Deck playerOneDeck = game.getPlayerOneDeck();
        Deck playerTwoDeck = game.getPlayerTwoDeck();

        System.out.println("Player One deck size: " + playerOneDeck.getDeckSize());
        System.out.println("Player Two deck size: " + playerTwoDeck.getDeckSize());

        System.out.println("Player One first card: " + playerOneDeck.cards.getFirst());
        System.out.println("Player Two first card: " + playerTwoDeck.cards.getFirst());
    }
}