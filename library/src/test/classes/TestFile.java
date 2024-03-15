package test.classes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import main.classes.*;
public class TestFile {
    @Test
    public void testLendBook() {
        Library library = new Library();
        Book book1 = new Book("Book-1", "Author-1", 10);

        Student student1 = new Student("Alice", 10);
        Student student2 = new Student("Bob", 11);

        library.addBook(book1);

        library.addStudent(student1);

        library.lendBook(book1, student2);
        assertEquals(student2.hasBook(book1), false);

    }

}
