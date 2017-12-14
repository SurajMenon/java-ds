package factory.method.incorrect;

public class App {

    public static void main(String args[]){

        fn("text");

        System.out.println("\n .. Starting csv...");
        fn("csv");
    }

    public static void fn(String type){
        BatchProcessor bp = new BatchProcessor();
        bp.processFile(type);
    }
}
