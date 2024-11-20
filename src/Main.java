public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.generateStartingDeck();
        System.out.println("Deck Size: " + deck.getDeckSize());
        System.out.println("First Card: " + deck.cards.getFirst());
        System.out.println("First Card value: " + deck.cards.getFirst().getRankValue());
    }
}