package main.java.algorithms.search.linear;

public class LinearSearchMain {
    public static void main(String[] args) {
        int[] input = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int toSearch = 283;
        int pos = find(input,toSearch);
        System.out.println("item found at pos :-" +  pos);
    }

    private static int find(int[] input, int toSearch) {
        int count = 0;
        for(int i : input){
            if(i!=toSearch){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
