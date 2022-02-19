//Dynamic Method Dispatch
class Color{
    int x;
    public void doColor(){
        System.out.println("Hello, I am painting !\n");
    }
}
class Red extends Color{
    public void doColor(){
        System.out.println("Hello, my painting first using color is Red !\n");
    }
}

public class Client {
public static void main(String [] args){
Color v = new Red();
v.doColor();
}
}