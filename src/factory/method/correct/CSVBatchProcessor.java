package factory.method.correct;

public class CSVBatchProcessor  extends BatchProcessor implements Processor {

    public void batchProcessData() {
        System.out.println("Batch Processing csv ..");
    }

    @Override
    public Processor getProcessor(){
        return this;
    }
}
