//1. Create customer variables for Sam, Jimmy, and Noah.

//2. Create the order status flag (true/false) for each customer.

//3. Cindhuri ordered a coffee. Based on her order status, print the correct status message to the console.

//4. Noah ordered a cappuccino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total. Note: Outcomes may be different depending on what you assigned as the status.

//5. Sam just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).

//6. Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.

//7. Try changing the price values for each drink and isReady flags (booleans), to test if all of your logic works, even when prices and statuses are changed.


public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        // double mochaPrice = 3.5;
        // double dripCoffeePrice = 2.5;
        // double lattePrice = 3.5;
        // double cappuccinoPrice = 5.5;
        double mochaPrice = 2.5;
        double dripCoffeePrice = 1.5;
        double lattePrice = 4.5;
        double cappuccinoPrice = 7.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        // boolean isReadyOrder1 = false;
        // boolean isReadyOrder2 = true;
        // boolean isReadyOrder3 = true;
        // boolean isReadyOrder4 = false;
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if(isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + dripCoffeePrice);
        } else {
            System.out.println(customer1 + pendingMessage);
            System.out.println(displayTotalMessage + dripCoffeePrice);
        }

        System.out.println(generalGreeting + customer4);
        if(isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        }

        
        if(isReadyOrder2){
            System.out.println(generalGreeting + customer2 + readyMessage);
            System.out.println(displayTotalMessage + 2*(lattePrice));
        } else {
            System.out.println(generalGreeting + customer2 + pendingMessage);
            System.out.println(displayTotalMessage + 2*(lattePrice));
        }

        System.out.println(customer3 + displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}
