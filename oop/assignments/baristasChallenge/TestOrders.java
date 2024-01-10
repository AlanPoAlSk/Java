import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 4.15);
        Item item2 = new Item("latte", 4.25);
        Item item3 = new Item("drip coffee", 3.50);
        Item item4 = new Item("cappuccino", 5.00);
        
        

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();


        Order order3 = new Order("Chinduri");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Bob");
        
        order1.addItem(item3);
        order1.addItem(item2);

        order2.addItem(item1);
        order2.addItem(item4);

        order3.addItem(item2);
        order3.addItem(item4);

        order4.addItem(item1);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item2);

        System.out.println(order1.getStatusMessage());
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());

        System.out.println(order3.getTotal());
        

        order1.display();
        
        order2.display();
        
        order3.display();
        
        order4.display();
        
        order5.display();
        
        

    }
}
