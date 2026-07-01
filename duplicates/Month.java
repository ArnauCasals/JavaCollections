package javaCollections.duplicates;
import java.util.Objects;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public boolean equals (Object other){
        if (this == other) return true;
        if (!(other instanceof Month)) return false;
        Month month = (Month) other;
        return Objects.equals(name, month.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
