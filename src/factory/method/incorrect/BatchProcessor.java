package factory.method.incorrect;

public class BatchProcessor {

    public void processFile(String file){
        readFile(file);
        parseData(file);

        Processor p=null;
        if(file.equals("text")){ // Violation of dependency inversion. Directly calling classes
            p=new TextBatchProcessor();
        }else if(file.equals("csv")) {
            p = new CSVBatchProcessor();
        }// Violation of open close principal as file needs to be modified.

        p.batchProcessData(file);
    }

    private void readFile(String file) {
        System.out.println("Reading file ..");
    }

    private void parseData(String file) {
        System.out.println("Parsing data ..");
    }


}
