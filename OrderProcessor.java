public class OrderProcessor {
    private Notifier notifier;  // Depend on abstraction

    // Constructor Injection (Flexible dependency injection)
    public OrderProcessor(Notifier notifier) {
        this.notifier = notifier;
    }

    public void processOrder(Order order) {
        // Process order logic here...
        System.out.println("Processing Order...");
        
        // Notify using the injected Notifier
        notifier.sendNotification("Order processed");
    }
}