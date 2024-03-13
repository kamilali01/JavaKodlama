public class App {
    public static void main(String[] args) throws Exception {
        // SOLID
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();
        // instance creation
        Customer customer = new Customer(1, "Kamil", "Aliyev", "123456");

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();
    }
}
