package main.java.immutableclass;

public class MutableClass {
    private int id;
    private String name;
    private String location;

    public MutableClass(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public MutableClass(MutableClass mutableClass){
        this.id = mutableClass.getId();
        this.name = mutableClass.getName();
        this.location = mutableClass.getLocation();
    }

    public MutableClass(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "MutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
