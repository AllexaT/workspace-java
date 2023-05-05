package poker;
import java.util.Random;

public class DeckOfCard {
    int cardsend=0;
    Card[] deck=  new Card[52];
    public DeckOfCard() {
        String[] face = {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String[] suit = {"梅花","菱形","愛心","黑桃"};
        for(int i=0;i<52;i++) {
            deck[i] =  new Card(face[i%13],suit[i/13]);
        }
    }
    public void shuffle() {
        int temp1;
        Card temp2;
        Random rand = new Random();
        for(int i=cardsend;i<52;i++) {
            temp1=cardsend+rand.nextInt(52-cardsend);
            temp2=deck[0];
            deck[0]=deck[temp1];
            deck[temp1]=temp2;
        }
    }
    
    public Card dealCard(){
        if(cardsend>=52)
            return null;
        Card myCard = deck[cardsend];
        cardsend++;
        return myCard;
    }
    public Card[] dealCards(int a) {
        Card[] c = new Card[a];
        for(int i=0;i<a;i++) 
            c[i] =dealCard();
        return c;
    }
    /*
    public void dealCard(int a) {
        for(int i=0;i<a;i++) {
            if(cardsend>51) {
                System.out.println("沒牌了!!");
                break;
            }
            System.out.println(i+" "+deck[cardsend]);
            cardsend++;
        }
    }
    */
}
