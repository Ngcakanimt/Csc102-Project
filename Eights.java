import java.util.*;
public class Eights{
	
    private Player one;
	private Player two;
	private Hand drawPile; 
	private Hand discardPile; 
	private Scanner in;
	
	public Eights() { 
	    Deck deck = new Deck("Deck");
		deck.shuffle();
		
        int handSize = 5;
		one = new Player("Allen");//change player name 
		deck.deal(one.getHand(), handSize);
		
        two = new Player("Chris"); 
		deck.deal(two.getHand(), handSize);
		
        discardPile = new Hand("Discards"); 
		deck.deal(discardPile, 1);
		
		drawPile = new Hand("Draw pile"); 
		deck.dealAll(drawPile);
		in = new Scanner(System.in);
	}
	
	public boolean isDone() {
		return one.getHand().empty() || two.getHand().empty(); 
		
	}
	
	public void reshuffle() { 
	    Card prev = discardPile.popCard(); 
		discardPile.dealAll(drawPile); 
		discardPile.addCard(prev); 
		drawPile.shuffle(); 
	}
	
	public Card draw() { 
	    if (drawPile.empty()) {
			reshuffle(); 
		} 
		return drawPile.popCard();
	}
	
	public Player nextPlayer(Player current) { 
	    if (current == one) {
			return two; 
		} 
		else { 
		    return one; 
		} 
	}
	
	public void displayState() { 
	    one.display();
		two.display(); 
		discardPile.display(); 
		System.out.println("Draw pile:"); 
		System.out.println(drawPile.size() + " cards");
	}
	
	public void waitForUser() {
		in.nextLine(); 
	}
	
	public void takeTurn(Player player) { 
	    Card prev = discardPile.last(); 
		Card next = player.play(this, prev); 
		discardPile.addCard(next);
        System.out.println(player.getName() + " plays " + next);
		System.out.println();
    }
	
	public void playGame() { 
	    Player player = one;
        // keep playing until there's a winner 
		while (!isDone()) { 
		    displayState(); 
			waitForUser(); 
			takeTurn(player); 
			player = nextPlayer(player);
		}
        // display the final score 
		one.displayScore(); 
		two.displayScore();
}





}