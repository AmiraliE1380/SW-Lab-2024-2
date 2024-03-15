package test.classes;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
        assertFalse(student2.hasBook(book1));

    }


    @Test
    public void testReturnBook(){
        Library library = new Library();
        Book book1 = new Book("Book-1", "Author-1", 10);

        Student student1 = new Student("Alice", 10);

        library.addBook(book1);

        library.addStudent(student1);

        library.lendBook(book1, student1);
        library.returnBook(book1, student1);
        assertFalse(student1.hasBook(book1));
    }
}
