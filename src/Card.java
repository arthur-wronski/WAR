public class Card {
    CardRank rank;
    Suit suit;

    public Card(CardRank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public CardRank getRank() {
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public String toString(){
        return rank + " of " + suit;
    }

    public int getRankValue(){
        // converts rank to actual value, e.g. TEN = 10, Jack = 11, Ace = 14
        // adding two to index as ranks start at two to get value
        return rank.ordinal() + 2;
    }
}
