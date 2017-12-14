package factory.method.correct;

public abstract class BatchProcessor {

    public void processFile(){
        readFile();
        parseData();

        Processor p = getProcessor();
        p.batchProcessData();
    }

    abstract public Processor getProcessor();//Factory method

    private void readFile() {
        System.out.println("Reading file ..");
    }

    private void parseData() {
        System.out.println("Parsing data ..");
    }


}
