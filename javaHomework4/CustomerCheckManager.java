public class CustomerCheckManager implements CustomerCheckService{

    @Override
    public boolean validateCustomer(Customer customer) {
        if(customer.getFirstName() == "Customer 1" && customer.getLastName() == "Customer 1" && customer.getNationalIdentityNumber() == "123456" && customer.getBirthYear() == "1990"){
            System.out.println("Doğrulama başarılı");
            return true;
        }
        else{
            System.out.println("Doğrulama başarısız");
            return false;
        }
    }
}
