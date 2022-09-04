package inheritance;

public class LabAssistant extends Assistant{
    public LabAssistant() {
    }

    public LabAssistant(String firstName, String lastName, String telephone, String email, String dependant, String title, String officeHour) {
        super(firstName, lastName, telephone, email, dependant, title, officeHour);
    }

    public void enterLab(){
            System.out.println(this.getFirstName() + this.getLastName() + "is entered lab.");
    }
    public void enterClass(){
        System.out.println(this.getFirstName() + this.getLastName() + "is entered class.");
    }

}
