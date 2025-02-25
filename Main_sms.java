public class Main_sms {
    public static void main(String[] args) {
        Order order1 = new Order("12345");
        Order order2 = new Order("67890");
        // Inject EmailNotifier
        Notifier emailNotifier = new EmailNotifier();
        OrderProcessor orderProcessor1 = new OrderProcessor(emailNotifier);
        orderProcessor1.processOrder(order1);

        // Inject SMSNotifier
        Notifier smsNotifier = new SMSNotifier();
        OrderProcessor orderProcessor2 = new OrderProcessor(smsNotifier);
        orderProcessor2.processOrder(order2);
    }
}