//Abstract class and method in java
abstract class Flower {
    String color, smell;
    int price;
    Flower(String a,String b, int c){
        this.color=a;
        this.smell=b;
        this.price=c;
    }
    abstract void gift();
    abstract void buy();
}
class Rose extends Flower{
    Rose(String a, String b, int c){
        super(a,b,c);
    }
    void gift(){
        System.out.println("Gift Rose of TK : "+price);
    }
    void buy(){
        System.out.println("Buy "+ color +" Rose of "+smell+" smell");
    }
}
class Marigold extends Flower{
    Marigold(String a, String b, int c){
        super(a,b,c);
    }
    void gift(){
        System.out.println("Gift Marigold of TK : "+price);
    }
    void buy(){
        System.out.println("Buy "+ color +" Marigold of "+smell+" smell");
    }
}
public class Q2a {
    public static void main(String[] args) {
        Rose obj = new Rose("Black","sweet", 50);
        obj.gift();
        obj.buy();
        Marigold obj2 = new Marigold("Yellow","light",5);
        obj2.gift();
        obj2.buy();
    }
}