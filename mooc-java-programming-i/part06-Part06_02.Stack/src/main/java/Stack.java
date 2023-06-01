import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stringList;

    public Stack() {
        this.stringList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return (stringList.size() == 0);
    }

    public void add(String value) {
        stringList.add(value);
    }

    public ArrayList<String> values() {
        return stringList;
    }

    public String take() {
        String temp = stringList.get(stringList.size() - 1);
        stringList.remove(stringList.size() - 1);
        return temp;
    }
}
