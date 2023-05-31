
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter hundred = new Counter(100);
        Counter zero = new Counter();

        hundred.increase(-10);
        System.out.println(hundred.value());
        
    }
}
