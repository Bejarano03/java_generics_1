import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testIntegerBoxNormalCase() {
        // Arrange
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);

        // Act
        Integer value = integerBox.get();

        // Assert
        assertEquals(10, value);
    }

    @Test
    void testStringBoxNormalCase() {
        // Arrange
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, Generics!");

        // Act
        String value = stringBox.get();

        // Assert
        assertEquals("Hello, Generics!", value);
    }

    @Test
    void testNumberBoxDoubleNormalCase() {
        // Arrange
        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.set(3.14);

        // Act
        Double value = doubleBox.get();

        // Assert
        assertEquals(3.14, value);
    }

    @Test
    void testIntegerBoxNullEdgeCase() {
        // Arrange
        Box<Integer> integerBox = new Box<>();

        // Act
        Integer value = integerBox.get();

        // Assert
        assertNull(value);
    }

    @Test
    void testStringBoxEmptyStringEdgeCase() {
        // Arrange
        Box<String> stringBox = new Box<>();
        stringBox.set("");

        // Act
        String value = stringBox.get();

        // Assert
        assertEquals("", value);
    }

    @Test
    void testNumberBoxZeroEdgeCase() {
        // Arrange
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.set(0);

        // Act
        Integer value = intBox.get();

        // Assert
        assertEquals(0, value);
    }
}