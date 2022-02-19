
class A{
    int i;
    void show1(int a){
    i=a;
    System.out.println(i);
}
}

class B extends A{
    int j;
    void show2(int a)
    {
        j=a;
        System.out.println(i+j);
    }
}
class C extends B{
    int k;
    void show3(int a){
    k=a;
    System.out.println(i+j+k);
}
}
public class Multilevel_Inheritance
{

public static void main(String[] args) {
    C ob=new C();
    ob.show1(10);
    ob.show2(20);
    ob.show3(30);
}
}
