package main.java.lambda;

public class MainClass {
    public static void main(String[] ar) {
        TestInterfaceTester obj = new TestInterfaceTester();
        obj.tester();
        LambdaFunctionalInterfaceEg fe = (a, b) -> a + b;
        System.out.println(fe.doSomething(1, 2));
        String str1 = "XYZ";
        String str2 = "ABC";
        String str3 = str1 + str2;
        String str4 = "XYZABC";
        String str5 = "XYZABC";
        System.out.println(str3==str4);
        System.out.println(str4==str5);
    }
}
