public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger _baseLogger) {
        baseLogger = _baseLogger;
    }

    public void Add() {
        System.out.println("Musteri eklendi");
        baseLogger.log("Log mesaji");
    }
}
