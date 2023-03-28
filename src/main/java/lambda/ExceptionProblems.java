package main.java.lambda;

import java.io.IOException;

public class ExceptionProblems {
    public static void main(String [] ars){

        try{
            myMethod();
        }catch (IOException exp){
            exp = new IOException("Hello");
            exp.printStackTrace();
        }catch (Exception exp){
            exp = new Exception("Hello");
            exp.printStackTrace();
        }
    }

    public static void myMethod() throws IOException {

    }

    public static class ExceptionSubClass extends ExceptionProblems{
        // if subclass it will work, else will not
        public static void myMethod(){

        }
    }
}
