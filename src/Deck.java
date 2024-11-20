import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void generateStartingDeck(){
        for (Suit suit: Suit.values()){
            for (CardRank rank: CardRank.values()){
                addCardToDeck(new Card(rank, suit));
            }
        }
        shuffleDeck();
    }

    public void addCardToDeck(Card card){
        cards.add(card);
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public int getDeckSize(){
        return cards.size();
    }
}
