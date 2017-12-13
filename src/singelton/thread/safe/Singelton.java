package singelton.thread.safe;

public class Singelton {

    static volatile Singelton s = null;

    private Singelton(){
        System.out.println("New Instance .. ");
    }

    //called double check lock
    public static Singelton getInstance(){
        if (s == null) {
            synchronized (Singelton.class) {
                if(s == null) {
                    s = new Singelton();
                }
            }
        }
        return s;
    }
}
