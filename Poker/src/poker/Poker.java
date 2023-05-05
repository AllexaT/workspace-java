package poker;
public class Poker {
	public static void main(String[] args) {
	    Card a[]= new Card[52];
        DeckOfCard doc = new DeckOfCard();
        
        doc.shuffle();
        a=doc.dealCards(5);
        for(int i=0;i<5;i++) {
            System.out.println(i+1+" "+a[i]);
        }
        a=doc.dealCards(53);
        for(int i=0;i<53;i++) {
            System.out.println(i+1+" "+a[i]);
        }
        
        
	}
}
