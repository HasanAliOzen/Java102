package inheritance;

public class Employee {
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String telephone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void enter(){
        System.out.println(this.firstName + this.lastName + "entered.");
    }

    public void exit(){
        System.out.println(this.firstName + this.lastName + "exit.");
    }
    public void diningHall() {
        System.out.println(this.firstName + this.lastName + "in dining hall.");
    }
}
