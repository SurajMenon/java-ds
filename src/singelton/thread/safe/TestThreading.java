package singelton.thread.safe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreading {

    public static void main(String args[]){

        ExecutorService e = Executors.newFixedThreadPool(2);
        e.submit(new InsSingelton());
        e.submit(new InsSingelton());
    }
}

class InsSingelton implements Runnable{
    @Override
    public void run() {
        Singelton s =  Singelton.getInstance();
        System.out.println(s.hashCode());
    }
}
