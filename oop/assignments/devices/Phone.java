public class Phone extends Device {


    public Phone() {
        
    }

    public void displayBattery(){
        super.displayBattery();
        if(getBattery() < 10) {
            alertMessage();
        }
    }

    public Device makeCall(){
        System.out.println("You make a call");
        
        this.setBattery(this.getBattery() - 5);
        return this;  
        
    }

    public Device playGame(){
        
        if(getBattery() <= 25){
            System.out.println("Sorry, battery level too low; I can't let you play a game.");
        }
        else {
        System.out.println("You play a game");
        
        this.setBattery(this.getBattery() - 20);
        }
        return this;  
    }

    public Device charge(){
        System.out.println("Charge the phone");
        
        this.setBattery(this.getBattery() + 50);
        return this;  
        
    }

    public void alertMessage(){
        System.out.println("battery critical! You need to charge your device");
    }
}