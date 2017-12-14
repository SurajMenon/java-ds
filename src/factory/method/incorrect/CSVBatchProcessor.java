package factory.method.incorrect;

public class CSVBatchProcessor implements Processor{

    public void batchProcessData(String file) {
        System.out.println("Batch Processing csv ..");
    }
}
