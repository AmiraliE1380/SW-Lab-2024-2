package test.classes;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;

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



    @Test
    void testSearchStudents() {
        Library library = new Library();
        Student student1 = new Student("student1", 0);
        Student student2 = new Student("student2", 1);
        Student student3 = new Student("student3", 2);

        library.addStudent(student1);
        library.addStudent(student2);
        library.addStudent(student3);

        ArrayList<Object> keysID = new ArrayList<>();
        keysID.add(0);
        keysID.add(2);
        keysID.add(10);
        keysID.add("student2");

        ArrayList<Object> keysName = new ArrayList<>();
        keysName.add("student1");
        keysName.add("student2");
        keysName.add("student10");
        keysName.add(2);

        assertNull(library.searchStudents(SearchByType.TITLE, keysName));
        assertNull(library.searchStudents(SearchByType.AUTHOR, keysName));
        
        assertArrayEquals(library.searchStudents(SearchByType.ID, keysID).toArray(), new Student[] {student1, student3});
        assertArrayEquals(library.searchStudents(SearchByType.NAME, keysName).toArray(), new Student[] {student1, student2});
    }
}
