package singelton.simple;

public class SimpleSingelton {

    static SimpleSingelton s = new SimpleSingelton(); //eager loading

    private SimpleSingelton(){
        System.out.println("New Instance ...");
    }

    public static SimpleSingelton getInstance(){
        return s;
    }
}
