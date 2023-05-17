package main.java.thiskeyword;

public class ThisTester {
    int number = 10;
    String a;
    String b;

    //parameterized constructor
    public ThisTester(String a , String b){
        this(); // this() can be used only inside a constructor else compilation issue
        this.a = a;
        this.b = b;
        System.out.println("this.number called from inside constructor :" + this.number);
    }

     //default constructor
     public ThisTester(){
        System.out.println("Default constructor is called");
    }

     //default constructor
     public ThisTester(int number){
        this();
        System.out.println("Number constructor is called");
        this.number = number;
    }


    public static void main(String[] args) {
        // cannot use this inside static main 
        int number = 15;
        myMethod();
        System.out.println("***** Test this.number *******");
        Runnable r = new Runnable() {
            int number = 100;
            @Override
            public void run() {
                int number =20;
                System.out.println("This.number :->" + this.number);
            }
        };
        r.run();
      
        System.out.println("***** Test Constructor *******");
        ThisTester tester = new ThisTester("A", "B");
        System.out.println("tester.a =" + tester.a);
        System.out.println("tester.b =" + tester.b);
        System.out.println("tester.number =" + tester.number);

        
        
    }

    private static void myMethod() {
        int number = 25;
        System.out.println("Number from inside method :" + number);
        // the below code will throw compilation issue -> this cannot be used inside static context
        //System.out.println("this.Number from inside method :" + this.number);
    }
    
}
