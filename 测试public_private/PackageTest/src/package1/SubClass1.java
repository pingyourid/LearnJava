package package1;

public class SubClass1 extends SuperClass {
    public static void main(String[] args) {

    }
    void dosomething()
    {
        SuperClass sup = new SuperClass();
        SubClass2 sub2 = new SubClass2();
        sup.method();  //Compile OK
        sub2.method();  //Compile OK
        method();
    }
}
class SubClass2 extends SuperClass{

}

class OtherClass
{
    void test()
    {
        SuperClass sup = new SuperClass();
        sup.method();  //Compile OK
    }
}