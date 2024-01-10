import java.util.ArrayList;

class Order {
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(String name){
        this.name = name;
        this.total = total; 
        this.ready = ready;
        this.items = new ArrayList<>(); 
    }

    public String getName(){
        return name;
    }

    public double getTotal(){
        return total;
    }
    
    public boolean getReady(){
        return ready;
    }
    public void setReady(boolean readyStatus){
        this.ready = readyStatus;
    }

    public void addItem(Item item){
        items.add(item);
        total += item.getPrice();
    }

    public ArrayList<Item> getItems(){
        return items;
    }
}