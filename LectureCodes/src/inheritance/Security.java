package inheritance;

public class Security extends Worker{
    private String document;

    public Security() {
    }

    public Security(String firstName, String lastName, String telephone, String email, String depertment, String shift, String document) {
        super(firstName, lastName, telephone, email, depertment, shift);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void watch(){
        System.out.println(this.getFirstName() + this.getLastName() + "is watching.");
    }
}
