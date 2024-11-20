import java.util.ArrayList;

public class Game {
    // needs to track deck of both players
    // needs a playRound() function that plays the top card of each player's deck and handles win condition
    // handle game loop - play until one of the decks is empty

    Deck playerOneDeck;
    Deck playerTwoDeck;

    public Game(){
        this.playerOneDeck = new Deck();
        this.playerTwoDeck = new Deck();
    }

    public void distributeCards(Deck startingDeck){
        int startingDeckSize = startingDeck.getDeckSize();

        playerOneDeck.setCards( new ArrayList<Card>(startingDeck.cards.subList(0, startingDeckSize / 2)));
        playerTwoDeck.setCards( new ArrayList<Card>(startingDeck.cards.subList(startingDeckSize / 2, startingDeckSize)));
    }

    public Deck getPlayerOneDeck() {
        return playerOneDeck;
    }

    public Deck getPlayerTwoDeck() {
        return playerTwoDeck;
    }
}
