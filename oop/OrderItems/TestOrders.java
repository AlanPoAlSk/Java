import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 4.15);
        Item item2 = new Item("latte", 4.25);
        Item item3 = new Item("drip coffee", 3.50);
        Item item4 = new Item("cappuccino", 5.00);
        
        // System.out.printf("Name: %s\n", item1.getName());
        // System.out.printf("Price: $%.2f\n", item1.getPrice());

        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Chinduri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        
        order2.addItem(item1);
        
        
        order3.addItem(item4);
        

        order4.addItem(item2);
        

        order1.setReady(true);

        order4.addItem(item2);
        order4.addItem(item2);
        

        order2.setReady(true);
        
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.getName());
        System.out.printf("Total: $%s\n", order1.getTotal());
        System.out.printf("Ready: %s\n", order1.getReady());

        System.out.printf("Name: %s\n", order2.getName());
        System.out.printf("Total: $%s\n", order2.getTotal());
        System.out.printf("Ready: %s\n", order2.getReady());

        System.out.printf("Name: %s\n", order3.getName());
        System.out.printf("Total: $%s\n", order3.getTotal());
        System.out.printf("Ready: %s\n", order3.getReady());

        System.out.printf("Name: %s\n", order4.getName());
        System.out.printf("Total: $%s\n", order4.getTotal());
        System.out.printf("Ready: %s\n", order4.getReady());

    }
}
