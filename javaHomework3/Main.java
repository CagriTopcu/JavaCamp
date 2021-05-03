import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Customer 1");
        customer1.setLastName("Customer 1");
        customer1.setDateOfBirth(new Date(1985, 1, 8));
        customer1.setNationalityId("123456789");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Customer 2");
        customer2.setLastName("Customer 2");
        customer2.setDateOfBirth(new Date(1990, 2, 7));
        customer2.setNationalityId("12345678");

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager.save(customer1);
    }
}
