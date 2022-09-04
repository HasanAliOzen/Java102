package inheritance;

public class Academician extends Employee{
    private String dependant;
    private String title;

    public Academician() {
    }

    public Academician(String firstName, String lastName, String telephone, String email, String dependant, String title) {
        super(firstName, lastName, telephone, email);
        this.dependant = dependant;
        this.title = title;
    }

    public String getDependant() {
        return dependant;
    }

    public void setDependant(String dependant) {
        this.dependant = dependant;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void enterClass(){
        System.out.println(this.getFirstName() + this.getLastName() + "is entered a class.");

    }
}
