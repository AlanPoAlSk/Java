import java.util.ArrayList;
import java.text.DecimalFormat;

public class CafeUtil {

    public int getStreakGoal(int count) {
        int sum = count; 
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        ArrayList<Double> lineItems = new ArrayList<Double>(); // Changed ArrayList type from Integer to Double

        for (double price : prices) {
            lineItems.add(price);
        }

        double total = 0.0;
        for (double item : lineItems) {
            total += item;
        }

        return total;
    }
    public void displayMenu(ArrayList<String> menu){
        for (int i = 0 ; i< menu.size(); i++) {
            System.out.println(i + " : " + menu.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello," + username);
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(username);
        System.out.println(customers);

    }

    public void printPriceChart(String product, double price, int maxQuantity){
        double total = 0.0;
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            total += price;
            System.out.println(i + " - " + total);
        }
        
    }

    //ninja bonus 2
    // public void printPriceChart(String product, double price, int maxQuantity){
    //     DecimalFormat decimalFormat = new DecimalFormat("$0.00");
    //     System.out.println(product);

    //     double total = 0.0;
    //     for (int i = 1; i <= maxQuantity; i++) {
    //         total += price;
    //         String formattedTotal = decimalFormat.format(total);
    //         System.out.println(i + " - " + formattedTotal);
    //     }
        
    // }

    //ninja bonus 3
    public void printPriceChartDiscount(String product1, double price1, int maxQuantity1) {
        DecimalFormat decimalFormat = new DecimalFormat("$0.00");
        System.out.println(product1);

        double total1 = 0.0;
        double discount = 0.5;

        for (int i = 1; i <= maxQuantity1; i++) {
            total1 += price1;
            if (i > 1) {
                total1 -= discount;
            }
            String formattedTotal = decimalFormat.format(total1);
            System.out.println(i + " - " + formattedTotal);
        }
    }
}