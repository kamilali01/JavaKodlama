public class App {
    public static void main(String[] args) throws Exception {
        // BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new EmailLogger(),new ConsoleLogger() };

        // for (BaseLogger baseLogger : loggers) {
        //     baseLogger.Log("Log mesaji");
        // }

        CustomerManager customerManager=new CustomerManager(new FileLogger());
        customerManager.Add();

    }
}
