package main.java;

public class TestProgram {
    final int num = 10;
    public static void main(String[] args) {
        TestProgram tp = new TestProgram();
        tp.display();
    }

    private void display() {
        int num = 12;
        Runnable r = new Runnable() {
            final int num = 15;
            @Override
            public void run() {
                int num =20;
                System.out.println(this.num);
            }
        };
        r.run();
    }


}
