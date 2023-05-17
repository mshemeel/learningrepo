package main.java.immutableclass;

import java.util.HashMap;

public class MainTesterClass {
    public static void main(String[] args) {
        HashMap<String, String> metaDataMap = new HashMap<>();
        metaDataMap.put("META1","META1");
        ImmutableExample imClass = new ImmutableExample("M1","M2",metaDataMap);
        System.out.println("ImmutableClass data->"+imClass);
        // Add new data to metaDataMap
        metaDataMap.put("META2","META2");
        System.out.println("ImmutableClass data->"+imClass);
        System.out.println("Metadata->"+metaDataMap);

    }
}
