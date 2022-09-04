package inheritance;

public class Assistant extends Academician{
    private String officeHour;

    public Assistant() {
    }

    public Assistant(String firstName, String lastName, String telephone, String email, String dependant, String title, String officeHour) {
        super(firstName, lastName, telephone, email, dependant, title);
        this.officeHour = officeHour;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public void makeQuiz(){
        System.out.println(this.getFirstName() + this.getLastName() + "is making quiz.");
    }
}
