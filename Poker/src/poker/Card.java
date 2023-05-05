package poker;

public class Card {
	private String face;
	private String suit;
	
    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }
    
   public String toString() {
       return "數字：" + face + " 花色：" + suit;
   }
}
