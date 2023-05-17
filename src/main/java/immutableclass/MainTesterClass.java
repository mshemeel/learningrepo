package main.java.immutableclass;

import java.util.HashMap;

public class MainTesterClass {
    public static void main(String[] args) {
        // creating mutable fields
        HashMap<String, String> metaDataMap = new HashMap<>();
        metaDataMap.put("META1","META1");
        MutableClass mutableClass = new MutableClass(1,"NAME1","LOC1");
        ImmutableExample imClass = new ImmutableExample("M1","M2",metaDataMap, mutableClass);
        System.out.println("ImmutableClass data->"+imClass);

        // Add new data to metaDataMap
        metaDataMap.put("META2","META2");
        // modify mutable class
        mutableClass.setName("NEW NAME");
        System.out.println("Metadata->"+metaDataMap);
        System.out.println("Updated mutable class->"+mutableClass);
        System.out.println("ImmutableClass data->"+imClass);

    }
}
