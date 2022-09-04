package inheritance;

public class Lecturer extends Academician{
    private String doorNo;

    public Lecturer() {
    }
    public Lecturer(String firstName, String lastName, String telephone, String email, String dependant, String title, String doorNo) {
        super(firstName, lastName, telephone, email, dependant, title);
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public void senateMeeting(){
        System.out.println(this.getFirstName() + this.getLastName() + "is in senate meeting.");
    }
}
