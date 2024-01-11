public class Device {
    private int battery;

    public Device(){
        this.battery = 100;
    }

    public int getBattery(){
        return battery;
    }

    public void setBattery(int batteryPercentage){
        this.battery = batteryPercentage;
    }

    public void displayBattery(){
        System.out.println("Battery: "+ this.battery + "%");
    }
}
