package singelton.holder;

public class Singelton {

    static volatile Singelton s = null;

    private Singelton(){
        System.out.println("New Instance .. ");
    }

    //called double check lock
    public static Singelton getInstance(){
        return Holder.INSTANCE;//Lazy loading
    }

    static class Holder{
        public static final Singelton INSTANCE = new Singelton();
    }
}
