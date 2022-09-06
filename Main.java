package Vehicles;

public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions); //case sonsists of object Dimensions
        Monitor theMonitor = new Monitor("27inchBeast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v.2.44");

        PC thePC =  new PC(theCase, theMonitor, theMotherboard);
        // Composition -> one class depends on other class, one object consists of other objects !

        thePC.getMonitor().drawPixelAt(5, 10, "blue");
        thePC.getMotherboard().loadProgram("Windows 11");
        thePC.getTheCase().pressPowerButton();
    }
}
