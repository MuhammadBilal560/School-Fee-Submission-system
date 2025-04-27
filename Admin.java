public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    public void setupFeeStructure() {
        System.out.println("Fee structure setup completed.");
    }

    public void viewReports() {
        System.out.println("Viewing payment reports...");
    }

    @Override
    public void dashboard() {
        System.out.println("Admin Dashboard");
    }
}