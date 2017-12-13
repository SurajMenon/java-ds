package singelton.thread.unsafe;

public class Singelton {

    static Singelton s = null;

    private Singelton(){
        System.out.println("New Instance .. ");
    }

    public static Singelton getInstance(){
        if (s == null) {
            s=new Singelton();
        }
        return s;
    }
}
