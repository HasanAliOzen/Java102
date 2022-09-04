package oop;

public class Student {
    private String firstName;
    private String lastName;
    private String idNo;
    private String address;
    private int note;

    public Student(String name, String surname, String idNo, String address, int note) {
        this.firstName = name;
        this.lastName = surname;
        this.idNo = idNo;
        this.address = address;
        if (note > 100 || note < 0) {
            note = 0;
        }
        this.note = note;
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

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        if (note > 100 || note < 0) {
            note = 0;
        }
        this.note = note;
    }
}
