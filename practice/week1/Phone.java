package week1;
public class Phone {
    String displaySize;
    double storage;

    void printSpecs(){
        System.out.printf("""
                %s %s
                """, displaySize, storage);
    }
}