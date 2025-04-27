public class Parent extends User {

    public Parent(String username, String password) {
        super(username, password);
    }

    public void payFee() {
        System.out.println("Fee paid successfully.");
    }

    public void viewFeeStatus() {
        System.out.println("Viewing fee status...");
    }

    @Override
    public void dashboard() {
        System.out.println("Parent Dashboard");
    }
}