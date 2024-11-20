public class Card {
    private final CardRank rank;
    private final Suit suit;

    public Card(CardRank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String toString(){
        return rank + " of " + suit;
    }

    public int getRankValue(){
        // converts rank to actual value, e.g. Ten = 10, Jack = 11, Ace = 14
        // when comparing two cards in the game, we need the value of say a Jack to be 11
        // I have all the possible card ranks stored in an ordered CardRank enum
        // to get the value of say the queen we do queen.ordinal()(=10 since 10th element)
        // and add 2 as the lowest possible card is 2 which wouldn't be equal to its ordinal of 0
        return rank.ordinal() + 2;
    }
}
