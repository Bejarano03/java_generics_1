import java.util.ArrayList;
import java.util.List;

public class Library<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }

    public void removeItem(T item) { items.remove(item); }

    public T findItemByName(String name, ItemNameExtractor<T> extractor) {
        for (T item : items) {
            if (extractor.extractName(item).equals(name)) {
                return item;
            }
        }
        return null;
    }

    public void printAllItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
