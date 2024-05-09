public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Name");
        Book book = new Book("Introduction to Java");
        Journal journal = new Journal("Computer Science Journal");

        ResourceManager resourceManager = new ResourceManager();
        resourceManager.borrowResource(student, book);
        resourceManager.borrowResource(student, journal);
    }
}