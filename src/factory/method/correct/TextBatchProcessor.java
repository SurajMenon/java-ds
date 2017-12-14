package factory.method.correct;

public class TextBatchProcessor extends BatchProcessor implements Processor{

    public void batchProcessData() {
        System.out.println("Batch Processing text ..");
    }

    @Override
    public Processor getProcessor(){
        return this;
    }
}
