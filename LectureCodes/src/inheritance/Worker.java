package inheritance;

public class Worker extends Employee{
    private String department;
    private String shift;

    public Worker() {
    }

    public Worker(String firstName, String lastName, String telephone, String email, String depertment, String shift) {
        super(firstName, lastName, telephone, email);
        this.department = depertment;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work(){
        System.out.println(this.getFirstName() + this.getLastName() + "is working.");
    }
}
