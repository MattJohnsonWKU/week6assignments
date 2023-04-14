package week06FinalCodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
   List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                String name = "";
                switch (i) {
                    case 11:
                        name = "Jack";
                        break;
                    case 12:
                        name = "Queen";
                        break;
                    case 13:
                        name = "King";
                        break;
                    case 14:
                        name = "Ace";
                        break;
                    default:
                        name = Integer.toString(i);
                        break;
                }
                name += " of " + suit;
                cards.add(new Card(i, name));
            }  
        }
    }
    // Method
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card draw() {
        return this.cards.remove(0);
    }
}
