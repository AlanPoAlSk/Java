import java.util.ArrayList;

class Order {
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>(); 
    }

    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>(); 
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public boolean getReady(){
        return ready;
    }
    public void setReady(boolean readyStatus){
        this.ready = readyStatus;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    ///////////////////////////////////

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
        
    }

    public void addItem(Item item){
        items.add(item);
        // total += item.getPrice();
    }

    public double getTotal() {
        double total = 0.0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("Name: " + this.name);

        for( Item item: items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total : $" + getTotal());
    }
}