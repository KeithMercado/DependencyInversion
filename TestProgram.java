public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();

        Book book = new Book("Book");
        Journal journal = new Journal("Journal");

        student.borrowResource(book);
        student.borrowResource(journal);
    }
}