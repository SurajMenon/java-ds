package singelton.simple;

public class SingeltonWithReflectionCheck {

    static SingeltonWithReflectionCheck s = new SingeltonWithReflectionCheck(); //eager loading

    private SingeltonWithReflectionCheck(){
        if(s!=null){
            throw new RuntimeException("Singelton already initialized");
        }
        System.out.println("New Instance ...");
    }

    public static SingeltonWithReflectionCheck getInstance(){
        return s;
    }
}
