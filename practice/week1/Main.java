package week1;
public class Main {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        obj1.displaySize = "6.1 OLED Super Retina Display";
        obj1.storage = 128;

        var obj2 = new Phone();
        obj2.displaySize = "5.2 IPS-LCD Display";
        obj2.storage = 64;

        obj1.printSpecs();
        obj2.printSpecs();
    }
    
}
