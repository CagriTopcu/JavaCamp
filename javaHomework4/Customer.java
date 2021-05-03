public class Customer implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private String nationalIdentityNumber;
    private String birthYear;

    public Customer(int id, String firstName, String lastName, String nationalIdentityNumber, String birthYear) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setNationalIdentityNumber(nationalIdentityNumber);
        this.setBirthYear(birthYear);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentityNumber() {
        return nationalIdentityNumber;
    }

    public void setNationalIdentityNumber(String nationalIdentityNumber) {
        this.nationalIdentityNumber = nationalIdentityNumber;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
}