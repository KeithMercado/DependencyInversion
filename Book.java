public class Book implements Resources{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Book to be Borrowed: " + title);
    }
}
