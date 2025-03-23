public class StringProcessor implements Processor<String> {
    @Override
    public String process(String item) {
        return new StringBuilder(item).reverse().toString();
    }
}
