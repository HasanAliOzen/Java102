package inheritance;

public class Computing extends Worker{
    private String mission;

    public Computing() {
    }

    public Computing(String firstName, String lastName, String telephone, String email, String depertment, String shift, String mission) {
        super(firstName, lastName, telephone, email, depertment, shift);
        this.mission = mission;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void networkSetup(){
        System.out.println(this.getFirstName() + this.getLastName() + "is network setting.");
    }
}
