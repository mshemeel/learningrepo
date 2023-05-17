package main.java.immutableclass;

import java.util.HashMap;
import java.util.Map;

//class should be final -> cannot be inherited
public final class ImmutableExample {

    //data members static and final -> cannot be modified once initialized
    private final String member1;
    private final String member2;
    private final Map<String, String> metadata; // mutable field

    //constructor should initialize attributes
    public ImmutableExample(String mem1 , String mem2,Map<String, String> metadata){
        System.out.println("Performing Deep Copy for Object initialization");
        this.member1 = mem1;
        this.member2 = mem2;
        // Iterating using for-each loop
        this.metadata = new HashMap<>(metadata); //deep copy
    }

    //getter method should return deep copy ->original object reference should not be returned
    public String getMember1(){
        return member1;
    }

    public String getMember2(){
        return member2;
    }

    public Map<String, String> getMetadata() {
        return new HashMap<>(metadata); // returning deep copy
    }

    //there should not be any setters


    @Override
    public String toString() {
        return "ImmutableExample{" +
                "member1='" + member1 + '\'' +
                ", member2='" + member2 + '\'' +
                ", metadata=" + metadata +
                '}';
    }
}
