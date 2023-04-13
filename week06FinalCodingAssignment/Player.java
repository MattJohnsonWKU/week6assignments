package week06FinalCodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
     List<Card> hand;
     int score;
     String name;

    public Player(String name) {
        this.hand = new ArrayList<>();
        this.score = 0;
        this.name = name;
    }

    public void describe() {
        System.out.println(this.name + "'s hand:");
        for (Card card : this.hand) {
            card.describe();
        }
    }

    public Card flip() {
        return this.hand.remove(0);
    }

    public void draw(Deck deck) {
        this.hand.add(deck.draw());
    }

    public void incrementScore() {
        this.score++;
    }

    public List<Card> getHand() {
        return hand;
    }
    
    public void drawHand() {
    	this.score += 0;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
