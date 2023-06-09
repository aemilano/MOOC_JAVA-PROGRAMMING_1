
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.size() == 0) {
            return "The collection " + this.name + " is empty."; 
        }

        String output = "The collection " + this.name + " has " + this.elements.size();

        if (this.elements.size() == 1) {
            output += " element:";
        } else {
            output += " elements:";
        }

        for (String i : elements) {
            output += "\n" + i;
        }

        return output;
    }
    
}
