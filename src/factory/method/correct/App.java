package factory.method.correct;

public class App {



    public static void main(String args[]){

        /*fn("text");

        System.out.println("\n .. Starting csv...");
        fn("csv");*/

        String type = "text";
        BatchProcessor bp = createBatchProcessor(type);
        bp.processFile();


    }

    public static BatchProcessor  createBatchProcessor(String type){
        if(type.equals("text")){
            return new TextBatchProcessor();
        }else if(type.equals("csv")){
            return new CSVBatchProcessor();
        }
        return null;
    }
}
