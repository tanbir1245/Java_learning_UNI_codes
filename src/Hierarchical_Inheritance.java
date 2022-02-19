class A1{
    int i;
    void show(int a){
    i=a;
    System.out.println(i);
}
}
class B1 extends A1{
    int j;
    void show2(int a)
    {
        j=a;
        System.out.println(i+j);
    }
}
class C1 extends A1{
    int k;
    void show3(int b){
    k=b;
    System.out.println(i+k);
}
}
public class Hierarchical_Inheritance
{
public static void main(String[] args) {
B1 obj2=new B1();
    obj2.show(4);
    obj2.show2(3);
C1 obj=new C1();
    obj.show(4);
    obj.show3(6);
}
}
