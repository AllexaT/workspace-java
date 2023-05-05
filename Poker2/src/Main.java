import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        int keyboard=0;
        int count=0;
        Scanner scanner = new Scanner(System.in);
        // TODO Auto-generated method stub
        String[] face = {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String[] suit = {"梅花","菱形","愛心","黑桃"};
        String[] deckOfCardFace = new String[52];
        String[] deckOfCardSuit = new String[52];
        for(int i=0;i<deckOfCardFace.length;i++) {
            deckOfCardFace[i] = face[i%13];
            deckOfCardSuit[i] = suit[i/13];
        }
        SecureRandom random = new SecureRandom();
            shuffle(false,count, deckOfCardFace, deckOfCardSuit);
            dealCard(false,count, 3, deckOfCardFace, deckOfCardSuit);
            count+=3;
            shuffle(false,count, deckOfCardFace, deckOfCardSuit);
            dealCard(false,count, 2, deckOfCardFace, deckOfCardSuit);
            count+=2;
        shuffle(true,count, deckOfCardFace, deckOfCardSuit);
        dealCard(true, count, 4, deckOfCardFace, deckOfCardSuit);
    }
        
    public static void shuffle(boolean newOld,int count,String[] deckOfCardFace,String[] deckOfCardSuit) {
        Random rand = new Random();
        int start,end;
        if(!newOld) {
            start=count;
            end=deckOfCardFace.length;
        }else {//發舊牌
            start=0;
            end=count;
        }
        for(int i = start;i<end;i++) {
            int randNum;
            if(!newOld) {
                randNum=count+rand.nextInt(52-count);
            }else {//發舊牌
                randNum=rand.nextInt(count);
            }
            String tempFace = deckOfCardFace[randNum];
            String tempSuit = deckOfCardSuit[randNum];
            deckOfCardFace[randNum]=deckOfCardFace[i];
            deckOfCardSuit[randNum]=deckOfCardSuit[i];
            deckOfCardFace[i]=tempFace;
            deckOfCardSuit[i]=tempSuit;
        }
    }
    public static void dealCard(boolean newOld,int count,int keyboard,String[] deckOfCardFace,String[] deckOfCardSuit) {
        int start,end;
        if(!newOld) {
            start=count;
            end=count+keyboard;
        }else {
            start=0;
            end=keyboard;
        }
        for(int i=start;i<end;i++) {
            String faces = deckOfCardFace[i];
            String suits = deckOfCardSuit[i];
            System.out.println(faces+'_'+suits);
        }
        System.out.println("=======================");
        
    }
}
