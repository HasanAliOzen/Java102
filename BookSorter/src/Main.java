import java.util.Comparator;
import java.util.Date;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<BookSorter> booksTreeSet = new TreeSet<>();

        booksTreeSet.add(new BookSorter("Lotr",100,"Tolkein","01.02.1917"));
        booksTreeSet.add(new BookSorter("Gotr",99,"Georga","01.02.2002"));
        booksTreeSet.add(new BookSorter("Atr",75,"Ahmet","01.02.1950"));
        booksTreeSet.add(new BookSorter("Btr",120,"Ali","01.02.2000"));

        for (BookSorter bookSorter : booksTreeSet) {
            System.out.println(bookSorter.getBookName());
        }

    }
}
