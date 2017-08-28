package package2;

import package1.SuperClass;

public class SubClass1 extends SuperClass {
    public static void main(String[] args) {

    }
    void dosomething()
    {
        SuperClass sup = new SuperClass();
        SubClass2 sub2 = new SubClass2();
        SubClass3 sub3 = new SubClass3();
        this.method();
        super.method();
        sup.method();
        sub2.method();
        sub3.method();
    }

}
class SubClass2 extends SuperClass{

}
class SubClass3 extends SuperClass{
    protected void method()
    {

    }
}

class OtherClass
{
    void test()
    {
        SuperClass sup = new SuperClass();
        sup.method();  //Compile OK
    }
}