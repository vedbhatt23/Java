import java.util.*;

public class Card {
    private int rank;
    private int suit;

    // Default constructor
    public Card() {
        rank = 0;
        suit = 0;
    }

    // Parameterized constructor
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getter methods for rank and suit
    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    // Setter methods for rank and suit
    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    // Create a deck of cards
    public static Vector<Card> createDeck() {
        Vector<Card> deck = new Vector<Card>();
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 4; j++) {
                deck.add(new Card(i, j));
            }
        }
        return deck;
    }

    // Print a single card
    public void printCard() {
        String[] ranks = {"", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"", "Clubs", "Diamonds", "Hearts", "Spades"};
        System.out.println(ranks[rank] + " of " + suits[suit]);
    }

    // Print the entire deck
    public static void printDeck(Vector<Card> deck) {
        for (Card card : deck) {
            card.printCard();
        }
    }

    // Check if two cards are the same
    public boolean sameCard(Card other) {
        return (this.rank == other.rank && this.suit == other.suit);
    }

    // Compare two cards
    public int compareCard(Card other) {
        if (this.rank > other.rank) {
            return 1;
        } else if (this.rank < other.rank) {
            return -1;
        } else {
            if (this.suit > other.suit) {
                return 1;
            } else if (this.suit < other.suit) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    // Sort the deck of cards
    public static void sortCard(Vector<Card> deck) {
        Collections.sort(deck, new Comparator<Card>() {
            public int compare(Card c1, Card c2) {
                return c1.compareCard(c2);
            }
        });
    }

    // Find a card in the deck
    public static int findCard(Vector<Card> deck, Card card) {
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).sameCard(card)) {
                return i;
            }
        }
        return -1;
    }

    // Deal 5 random cards from the deck
    public static void dealCards(Vector<Card> deck) {
        Random random = new Random();
        System.out.println("Your cards are:");
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(deck.size());
            Card card = deck.get(index);
            card.printCard();
            deck.remove(index);
        }
    }
}
