import oop.Book;
import oop.Course;
import oop.Student;

public class Main {
    public static  void  main(String[] args){
        /*
        Book harryPotter = new Book("Harry Potter",150);
        Book lordOfTheRings = new Book("Lord Of the Rings", -100);

        System.out.println(lordOfTheRings.getPageNumber());
        */

        Student st1 =new Student("Mustafa","Özen", "100","AA",85);
        Student st2 =new Student("Hasan","Özen", "101","BB",110);
        Student st3 =new Student("Ali","Özen", "102","CC",50);


        Course mat = new Course("MAT101","MAT");
        Student[] stu = {st1,st2,st3};

        System.out.println("Ortalama : " + mat.calcAverage(stu));


    }
}
