//Passing object as parameter
class square{
    private int length;
    void set_length(int a){
        length=a;
    }
    int area(square obj){
        return obj.length*obj.length;
    }
}

public class Q1b{
    public static void main(String[] args){
        square obj = new square();
        obj.set_length(4);
        int x=obj.area(obj);
        System.out.println("The area : "+x);
    }
}
