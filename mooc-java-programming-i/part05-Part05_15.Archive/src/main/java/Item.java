public class Item {
    private String identifier;
    private String name = "";
    
    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    
    public String toString() {
        return (this.identifier + ": " + this.name);
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;

        if (this.identifier.equals(comparedItem.identifier)) {
            return true;
        }

        return false;
    }
}
