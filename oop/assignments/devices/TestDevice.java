public class TestDevice{
    public static void main(String[] args) {
		System.out.println("----- Device Test ------");
        Phone phone1 = new Phone();
        phone1.displayBattery();
        
        phone1.makeCall();
        phone1.displayBattery();
        phone1.makeCall();
        phone1.displayBattery();
        phone1.makeCall();
        phone1.displayBattery();

        phone1.playGame();
        phone1.displayBattery();
        phone1.playGame();
        phone1.displayBattery();
        phone1.playGame();
        phone1.displayBattery();
        phone1.playGame(); // <- comment out this and remove the next comment to see the alert message displayed in the console

        // phone1.makeCall();
        // phone1.displayBattery();
        // phone1.makeCall();
        // phone1.displayBattery();
        // phone1.makeCall();
        // phone1.displayBattery();
        // phone1.makeCall();
        // phone1.displayBattery();


        phone1.displayBattery();

        phone1.charge();
        phone1.displayBattery();
	}
}