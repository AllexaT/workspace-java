import java.util.Random;

public class DeckOfCard {
    int count=0;
    Card[] deck=new Card[52];
    public DeckOfCard() {
        String[] face = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] suit = {"♣","♦","♥","♠"};
        for(int i=0;i<52;i++) {
            deck[i] =  new Card(face[i%13],suit[i/13]);
        }
    }
    
    public void shuffle(boolean newOld) {
        if(!newOld) {
            int temp1;
            Card temp2;
            Random rand = new Random();
            for(int i=count;i<52;i++) {
                temp1=count+rand.nextInt(52-count);
                temp2=deck[count];
                deck[count]=deck[temp1];
                deck[temp1]=temp2;
            }
        }else {
            int temp1;
            Card temp2;
            Random rand = new Random();
            for(int i=0;i<count;i++) {
                temp1=rand.nextInt(count-1);
                temp2=deck[0];
                deck[0]=deck[temp1];
                deck[temp1]=temp2;
            }
        }
    }
    
    public Card dealCard(){
        if(count>=52)
            return null;
        Card myCard = deck[count];
        count++;

        return myCard;
    }
    
    public Card[] dealCards(int a,boolean newOld) {
        Card[] c = new Card[a];
        if(!newOld) {
            for(int i=0;i<a;i++) {
                c[i]=dealCard();
                System.out.println("New-"+ (i+1)+ " " +dealCard());
            }
        }else {
            int temp;
            temp=count;
            count=0;
            for(int i=0;i<a;i++) {
                c[i]=dealCard();
                System.out.println("Old-"+ (i +1)+ " " +dealCard());
            }
            count=temp;
        }
        System.out.println("============================");
        return c;
    }
    
}
