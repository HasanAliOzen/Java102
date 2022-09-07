import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList =new ArrayList<>();
        bookList.add(new Book("Book Name",95,"Book Author","01.02.2003"));
        bookList.add(new Book("Book Name1",105,"Book Author1","01.02.2003"));
        bookList.add(new Book("Book Name2",95,"Book Author2","01.02.2003"));
        bookList.add(new Book("Book Name3",95,"Book Author3","01.02.2003"));
        bookList.add(new Book("Book Name4",120,"Book Author4","01.02.2003"));
        bookList.add(new Book("Book Name5",150,"Book Author5","01.02.2003"));
        bookList.add(new Book("Book Name6",200,"Book Author6","01.02.2003"));
        bookList.add(new Book("Book Name7",95,"Book Author7","01.02.2003"));
        bookList.add(new Book("Book Name8",95,"Book Author8","01.02.2003"));
        bookList.add(new Book("Book Name9",101,"Book Author9","01.02.2003"));


        Map<String, String> bookNameAndAuthor = new TreeMap<>();

        bookList.stream().forEach(it -> {
            bookNameAndAuthor.put(it.getBookName(), it.getAuthorName());
        });

        bookNameAndAuthor.forEach((key,value) ->{
            System.out.println(key + " " + value);
        });

        System.out.println("######################");
        bookList.stream().filter(it -> it.getPageNumber() > 100).forEach(it->
                System.out.println(it.getBookName()));



    }
}
