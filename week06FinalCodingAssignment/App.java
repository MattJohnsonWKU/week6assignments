package week06FinalCodingAssignment;

public class App {

    public static void main(String[] args) {

      // a)	Instantiate a Deck and two Players, call the shuffle method on the deck.
    	
        Deck deck = new Deck();
        Player player1 = new Player("Mattox");
        Player player2 = new Player("Maverick");

       
        
        deck.shuffle();

        // b)	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
        
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // c)	Using a traditional for loop, iterate 26 times and call the flip method for each player.
           
        for (int i = 1; i <= 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();
            int result = card1.getValue() - card2.getValue();
            
            System.out.println("Round " + i + ":");
            System.out.println("-----------------------------");
            System.out.println(player1.getName() + "'s hand: " + card1.getName());
            System.out.println(player1.getName() + "'s score: " + player1.getScore());
            System.out.println(player2.getName() + "'s hand: " + card2.getName());
            System.out.println(player2.getName() + "'s score: " + player2.getScore());
         

            if (result > 0) {
                System.out.println(player1.getName() + " wins the round!");
                player1.incrementScore();
            } else if (result < 0) {
                System.out.println(player2.getName() + " wins the round!");
                player2.incrementScore();
            } else {
                System.out.println("It's a draw!");
            }
            System.out.println("-----------------------------");
          
                       
           
            
        }

        // f)	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
        int score1 = player1.getScore();
        int score2 = player2.getScore();
        System.out.println("Final score:");
        System.out.println(player1.getName() + ": " + score1);
        System.out.println(player2.getName() + ": " + score2);
 
        // e)	After the loop, compare the final score from each player.         
        if (score1 > score2) {
            System.out.println("Winner: " + player1.getName());
        } else if (score2 > score1) {
            System.out.println("Winner: " + player2.getName());
        } else {
            System.out.println("Draw");
        }
    }
}


