import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

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

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Card takeTopCard() {
        // Note: this also pops top card from deck
        return cards.removeFirst();
    }

    public void emptyDeck() {
        cards.clear();
    }
}
