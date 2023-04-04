import java.util.*;
public class CardGame {
    public static void main(String[] args) {
        Card c = new Card();
        Vector<Card> deck = c.createDeck();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print deck of cards");
            System.out.println("2. Print a single card");
            System.out.println("3. Check if two cards are the same");
            System.out.println("4. Compare two cards");
            System.out.println("5. Sort the deck of cards");
            System.out.println("6. Find a card in the deck");
            System.out.println("7. Deal 5 random cards");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    c.printDeck(deck);
                    break;
                case 2:
                    System.out.print("Enter the rank of the card: ");
                    int rank = scanner.nextInt();
                    System.out.print("Enter the suit of the card: ");
                    int suit = scanner.nextInt();
                    Card card = new Card(rank, suit);
                    card.printCard();
                    break;
                case 3:
                    System.out.print("Enter the rank of the first card: ");
                    int rank1 = scanner.nextInt();
                    System.out.print("Enter the suit of the first card: ");
                    int suit1 = scanner.nextInt();
                    Card card1 = new Card(rank1, suit1);
                    System.out.print("Enter the rank of the second card: ");
                    int rank2 = scanner.nextInt();
                    System.out.print("Enter the suit of the second card: ");
                    int suit2 = scanner.nextInt();
                    Card card2 = new Card(rank2, suit2);
                    if (card1.sameCard(card2)) {
                        System.out.println("The two cards are the same.");
                    } else {
                        System.out.println("The two cards are not the same.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the rank of the first card: ");
                    int rank3 = scanner.nextInt();
                    System.out.print("Enter the suit of the first card: ");
                    int suit3 = scanner.nextInt();
                    Card card3 = new Card(rank3, suit3);
                    System.out.print("Enter the rank of the second card: ");
                    int rank4 = scanner.nextInt();
                    System.out.print("Enter the suit of the second card: ");
                    int suit4 = scanner.nextInt();
                    Card card4 = new Card(rank4, suit4);
                    int result = card3.compareCard(card4);
                    if (result > 0) {
                        System.out.println("The first card is higher than the second card.");
                    } else if (result < 0) {
                        System.out.println("The second card is higher than the first card.");
                    } else {
                        System.out.println("The two cards have the same rank and suit.");
                    }
                    break;
                case 5:
                    c.sortCard(deck);
                    System.out.println("The deck of cards has been sorted.");
                    break;
                case 6:
                    System.out.print("Enter the rank of the card: ");
                    int rank5 = scanner.nextInt();
                    System.out.print("Enter the suit of the card: ");
                    int suit5 = scanner.nextInt();
                    Card card5 = new Card(rank5, suit5);
                    int index = c.findCard(deck, card5);
                    if (index == -1) {
                        System.out.println("The card is not in the deck.");
                    } else {
                        System.out.println("The card is at index " + index + " in the deck.");
                    }
                    break;
                case 7:
                    c.dealCards(deck);
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);
        scanner.close();
    }
}
