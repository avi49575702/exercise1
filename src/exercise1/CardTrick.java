package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author kumar517
 * @author Abhishek Kumar Feb 06, 2024 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1); // Random value between 1 and 13
            card.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit
            hand[i] = card;
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        // Asking the user to pick a card
        System.out.println("Pick a card value (1-13)");
        int userValue = scanner.nextInt();
        System.out.println("Pick a suit (0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
        String userSuit = Card.SUITS[scanner.nextInt()];

        // Search for the card
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card was not in the hand.");
        }

        scanner.close();
    }
    
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Abhishek Kumar Feb 2024
     * Making changes online on GitHub repository
     */
    private static void printInfo() {
        System.out.println("I am done!");
        System.out.println("You guessed right!");
        System.out.println();
        
        System.out.println("My name is Abhushek Kumar");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Secure a better job in IT field!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Painting");
        System.out.println("-- Watching Movies");
        System.out.println("-- Eating");
	System.out.println("-- Shopping");

        System.out.println();
        
        }
        
    }