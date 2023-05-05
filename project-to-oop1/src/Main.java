
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Card a[]= new Card[52];
        DeckOfCard doc = new DeckOfCard();
        
        doc.shuffle(false);
        doc.dealCards(3,false);
        doc.shuffle(false);
        doc.dealCards(2,false);
        doc.shuffle(true);
        doc.dealCards(2,true);
        doc.shuffle(false);
        doc.dealCards(2,false);
    }

}
