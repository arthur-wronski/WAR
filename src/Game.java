import java.util.ArrayList;

public class Game {
    private final Deck playerOneDeck;
    private final Deck playerTwoDeck;

    private final Deck cardsInPlay;

    public Game(){
        this.playerOneDeck = new Deck();
        this.playerTwoDeck = new Deck();

        this.cardsInPlay = new Deck();
    }

    private void distributeCards(Deck startingDeck){
        int startingDeckSize = startingDeck.getDeckSize();

        // give half of the shuffled starting deck to each player
        playerOneDeck.setCards( new ArrayList<Card>(startingDeck.getCards().subList(0, startingDeckSize / 2)));
        playerTwoDeck.setCards( new ArrayList<Card>(startingDeck.getCards().subList(startingDeckSize / 2, startingDeckSize)));
    }

    private void addCardToPlayPile(Card card){
        cardsInPlay.addCardToDeck(card);
    }

    private void addCardsToWinner(Deck winnerDeck){
        cardsInPlay.shuffleDeck();

        for (Card card: cardsInPlay.getCards()) {
            winnerDeck.addCardToDeck(card);
        }
        cardsInPlay.emptyDeck();
    }

    private void initialiseGame(){
        Deck startingDeck = new Deck();
        startingDeck.generateStartingDeck();

        distributeCards(startingDeck);
    }

    private void playRound(){
        System.out.println("Player One deck size: " + playerOneDeck.getDeckSize());
        System.out.println("Player Two deck size: " + playerTwoDeck.getDeckSize());

        Card playerOneTopCard = playerOneDeck.takeTopCard();
        Card playerTwoTopCard = playerTwoDeck.takeTopCard();

        addCardToPlayPile(playerOneTopCard);
        addCardToPlayPile(playerTwoTopCard);

        System.out.println("Player 1 plays card: " + playerOneTopCard);
        System.out.println("Player 2 plays card: " + playerTwoTopCard);

        if (playerOneTopCard.getRankValue() > playerTwoTopCard.getRankValue()){
            System.out.println("Player 1 wins the round!");
            addCardsToWinner(playerOneDeck);
        } else if (playerOneTopCard.getRankValue() < playerTwoTopCard.getRankValue()) {
            System.out.println("Player 2 wins the round!");
            addCardsToWinner(playerTwoDeck);
        }else{
            System.out.println("Draw! Time for WAR");
            if (playerOneDeck.getDeckSize() <= 1 || playerTwoDeck.getDeckSize() <= 1){
                System.out.println("Not enough cards to fight the WAR");
                return;
            }
            addCardToPlayPile(playerOneDeck.takeTopCard());
            addCardToPlayPile(playerTwoDeck.takeTopCard());
            playRound();
        }
    }

    public void playGame(){
        initialiseGame();

        while (playerOneDeck.getDeckSize() > 0 && playerTwoDeck.getDeckSize() > 0){
            playRound();
        }

        if (playerOneDeck.getDeckSize() == 0){
            System.out.println("Player 2 wins the game!");
        } else if (playerTwoDeck.getDeckSize() == 0) {
            System.out.println("Player 1 wins the game");
        }else{
            // The chance of a draw when playing WAR is incredibly small
            System.out.println("By the might of Gods! It's a draw");
        }
    }
}
