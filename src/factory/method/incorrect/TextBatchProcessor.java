package factory.method.incorrect;

public class TextBatchProcessor implements Processor{

    public void batchProcessData(String file) {
        System.out.println("Batch Processing text ..");
    }
}
