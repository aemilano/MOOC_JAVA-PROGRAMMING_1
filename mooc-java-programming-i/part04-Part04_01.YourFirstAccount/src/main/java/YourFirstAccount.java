
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account artosAccount = new Account("Arto's account", 100);

        artosAccount.deposit(20);
        
        System.out.println("End State");
        System.out.println(artosAccount);
    }
}
