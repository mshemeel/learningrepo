package main.java.innerclasses;

public class OuterClass {

    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.PrivateClass pricIC = oc.new PrivateClass();
        System.out.println("pricIC ->" + pricIC);
    }

    //Public inner class
    public class PublicInnerClass {
        private int num = 10;

        public int getNum() {
            return num;
        }
    }

    // public static inner class
    public static class PublicStaticClass {
        private int num = 15;

        public int getNum() {
            return num;
        }
    }

    //private inner class
    private class PrivateClass {
        private int num = 20;

        public int getNum() {
            return num;
        }
    }

    public int getPrivateClassNum(){
        OuterClass oc = new OuterClass();
        return oc.new PrivateClass().getNum();
    }

}
