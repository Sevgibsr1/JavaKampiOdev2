public class Main {
    public static void main(String[] args) {

//        EmailLogger logger = new EmailLogger();
//        logger.Log("Log mesajı");


        CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}