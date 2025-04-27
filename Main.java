public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("admin1", "pass123");
        Parent parent = new Parent("parent1", "parentpass");

        admin.dashboard();
        admin.setupFeeStructure();
        admin.viewReports();

        parent.dashboard();
        parent.payFee();
        parent.viewFeeStatus();

        PaymentService paymentService = new PaymentService();
        paymentService.pay("Credit Card");
        paymentService.sendReceipt("parent@example.com");

        FeeManager feeManager = new FeeManager();
        feeManager.trackFee();
        feeManager.sendReminder("1234567890");
    }
}