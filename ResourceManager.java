public class ResourceManager {
    public void borrowResource(Student student, Resources resources) {
        System.out.println(student.getName() + " is borrowing: ");
        resources.borrow();
    }
}