class Addition{
  int x, y;
    Addition (int a, int b){
    x = a;
    y = b;
  }
  int add (){
    return x + y;
  }
}
class AdvancedAddition extends Addition{
  int z;
    AdvancedAddition (int a, int b, int c){
    super (a, b);
    z = c;
  }
  int add (){
    return x + y + z;
  }
}

public class Q2b{
  public static void main (String[] args){
    
    AdvancedAddition obj = new AdvancedAddition (2, 9, 4);
    int x = obj.add ();
      System.out.println (x);
  }
}