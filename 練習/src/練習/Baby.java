package 練習;

public class Baby {
    int height=0;
    int weight=0;
    
    public Baby(int height) {
        this.height=height;
    }
    
    public Baby(int height,int weight) {
        this.height=height;
        this.weight=weight;
    }
    
    public void sleep() {
        System.out.println("sleeping...");
    }
    
    public String toString() {
        return "身高：" + height +"\n體重：" +weight;
    }
}
