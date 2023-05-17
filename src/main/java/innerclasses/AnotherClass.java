package main.java.innerclasses;

public class AnotherClass {
    public static void main(String[] args) {
        // compilation error -> inner class should be static to use this way
        //OuterClass.PublicInnerClass pic = new OuterClass.PublicInnerClass();

        //to work -> need to instantiate like below
        OuterClass oc = new OuterClass();
        OuterClass.PublicInnerClass pubIC = oc.new PublicInnerClass();
        System.out.println("pubIC ->"+ pubIC.getNum());
        System.out.println(pubIC.getOuterClassPublicMember());
        System.out.println(pubIC.getOuterClassPrivateMember());

        // no compilation error -> works fine
        OuterClass.PublicStaticClass psc = new OuterClass.PublicStaticClass();
        System.out.println("PSC ->"+ psc.getNum());

        //private inner class -> can be instantiated only from Outer class
        System.out.println("Private Class Num ->"+ oc.getPrivateClassNum());




    }
}
