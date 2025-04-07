public class Journal implements Resources{
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Journal to be borrowed: " + title);
    }
}
