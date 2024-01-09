import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        
    /* 
        You will need add 1 line to this file to create an instance 
        of the CafeUtil class. 
        Hint: it will need to correspond with the variable name used below..
    */

        CafeUtil appTest = new CafeUtil();
    
        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week %d: %d \n\n", 10, appTest.getStreakGoal(0));
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }

        // ninja bonus1
        
        String product = "Colombian Coffee Grounds";
        double price = 15.0;
        int maxQuantity = 3;
        appTest.printPriceChart(product, price, maxQuantity);

        String product1 = "Colombian Coffee Grounds - last pieces";
        double price1 = 2.0;
        int maxQuantity1 = 4;
        // double discount = 0.5;
        appTest.printPriceChartDiscount(product1, price1, maxQuantity1);
    }
}
