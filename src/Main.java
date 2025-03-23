public class Main {
    public static void main(String[] args) {
        // Part 1: Understanding Generics

        // Box for Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        integerBox.printBox(); // Output: Box contains: 10

        // Box for String
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, Generics!");
        stringBox.printBox(); // Output: Box contains: Hello, Generics!

        // NumberBox for Double
        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.set(3.14);
        doubleBox.printBox(); // Output: Box contains: 3.14

        // NumberBox for Integer
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.set(5);
        intBox.printBox(); // Output: Box contains: 5

        // The following line would cause a compile-time error:
        // NumberBox<String> errorBox = new NumberBox<>(); // Error: Type argument String is not within bounds of type-variable T

        // Part 2: Advanced Usage of Generics

        // StringProcessor
        StringProcessor stringProcessor = new StringProcessor();
        String reversedString = stringProcessor.process("Reverse me");
        System.out.println("Reversed string: " + reversedString); // Output: Reversed string: em esreveR

        // Part 3: Practical Application

        // Library for Books
        Library<Book> bookLibrary = new Library<>();
        bookLibrary.addItem(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
        bookLibrary.addItem(new Book("Pride and Prejudice", "Jane Austen"));
        bookLibrary.addItem(new Book("1984", "George Orwell"));

        // Find a book by title
        Book foundBook = bookLibrary.findItemByName("1984", Book::getTitle);
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook); // Output: Found book: Book{title='1984', author='George Orwell'}
        }

        // Library for DVDs
        Library<DVD> dvdLibrary = new Library<>();
        dvdLibrary.addItem(new DVD("Inception", "Christopher Nolan"));
        dvdLibrary.addItem(new DVD("The Matrix", "The Wachowskis"));

        // Find a DVD by title
        DVD foundDVD = dvdLibrary.findItemByName("Inception", DVD::getTitle);
        if (foundDVD != null) {
            System.out.println("Found DVD: " + foundDVD); // Output: Found DVD: DVD{title='Inception', director='Christopher Nolan'}
        }

        System.out.println("All books in the library:");
        bookLibrary.printAllItems();
        System.out.println("All DVDs in the library:");
        dvdLibrary.printAllItems();
    }
}