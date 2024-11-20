import java.util.ArrayList;
import java.util.List;

public class Game {
    Deck playerOneDeck;
    Deck playerTwoDeck;

    Deck cardsInPlay;

    public Game(){
        this.playerOneDeck = new Deck();
        this.playerTwoDeck = new Deck();

        this.cardsInPlay = new Deck();
    }

    public void distributeCards(Deck startingDeck){
        int startingDeckSize = startingDeck.getDeckSize();

        playerOneDeck.setCards( new ArrayList<Card>(startingDeck.getCards().subList(0, startingDeckSize / 2)));
        playerTwoDeck.setCards( new ArrayList<Card>(startingDeck.getCards().subList(startingDeckSize / 2, startingDeckSize)));
    }

    public Deck getPlayerOneDeck() {
        return playerOneDeck;
    }

    public Deck getPlayerTwoDeck() {
        return playerTwoDeck;
    }

    public void addCardToPile(Card card){
        cardsInPlay.addToDeck(card);
    }

    public void addCardsToWinner(Deck winnerDeck){
        cardsInPlay.shuffleDeck();

        for (Card card: cardsInPlay.getCards()) {
            winnerDeck.addToDeck(card);
        }
        cardsInPlay.emptyDeck();
    }

    public void initialiseGame(){
        Deck startingDeck = new Deck();
        startingDeck.generateStartingDeck();

        distributeCards(startingDeck);
    }

    public void playRound(){
        System.out.println("Player One deck size: " + playerOneDeck.getDeckSize());
        System.out.println("Player Two deck size: " + playerTwoDeck.getDeckSize());

        Card playerOneTopCard = playerOneDeck.takeTopCard();
        Card playerTwoTopCard = playerTwoDeck.takeTopCard();

        addCardToPile(playerOneTopCard);
        addCardToPile(playerTwoTopCard);

        System.out.println("Player 1 plays card: " + playerOneTopCard + " with value: " + playerOneTopCard.getRankValue());
        System.out.println("Player 2 plays card: " + playerTwoTopCard + " with value: " + playerTwoTopCard.getRankValue());

        if (playerOneTopCard.getRankValue() > playerTwoTopCard.getRankValue()){
            System.out.println("Player 1 wins!");
            addCardsToWinner(playerOneDeck);
        } else if (playerOneTopCard.getRankValue() < playerTwoTopCard.getRankValue()) {
            System.out.println("Player 2 wins!");
            addCardsToWinner(playerTwoDeck);
        }else{
            System.out.println("Draw!");
            if (playerOneDeck.getDeckSize() <= 1){
                System.out.println("Player 1 doesn't have enough cards to fight the WAR");
                return;
            } else if (playerTwoDeck.getDeckSize() <= 1) {
                System.out.println("Player 2 doesn't have enough cards to fight the WAR");
                return;
            }
            addCardToPile(playerOneDeck.takeTopCard());
            addCardToPile(playerTwoDeck.takeTopCard());
            playRound();
        }
    }
}
