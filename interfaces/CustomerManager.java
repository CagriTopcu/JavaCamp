public class CustomerManager {

    Logger[] loggers;
    public CustomerManager(Logger[] logger){
        this.loggers = logger;
    }

    public void add(Customer customer){
        System.out.println("Müşteri eklendi " + customer.getFirstName());

        for(Logger logger : loggers){
            logger.log(customer.getFirstName());
        }
    }

    public void delete(Customer customer){
        System.out.println("Müşteri silindi " + customer.getFirstName());

        for(Logger logger : loggers){
            logger.log(customer.getFirstName());
        }
    }
}
