
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("root", "The exercise template comes with a pre-defined Message class that can be used to create objects representing messages. Each message has a sender and some content. Implement the MessagingService class. The class must have a parameterless constructor and contain a list of Message objects. After that, add the following two methods to the class");
        MessagingService unreadList = new MessagingService();

        unreadList.add(message);

        System.out.println(unreadList.getMessages());
    }
}
