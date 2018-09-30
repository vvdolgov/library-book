public class LibraryMainApp {
    public static void main(String[] args) {
        try{
            Book b1 = new Book(1, "Горе от ума");
            Book b2 = new Book(2, "Сказка о царе Салтане");
            Book b3 = new Book(3, "Человек-амфибия");
            Book b4 = new Book(4, "Мертвые души");
            StudentLibrary studentLibrary = StudentLibrary.getInstance();
            studentLibrary.addNewBook(b1);
            studentLibrary.addNewBook(b2);
            studentLibrary.addNewBook(b3);

            System.out.println(studentLibrary.findAvailableBooks());
            studentLibrary.borrowBook(b2, "Sam");
            System.out.println(studentLibrary.findAvailableBooks());
            studentLibrary.returnBook(b2, "Sam");
            System.out.println(studentLibrary.findAvailableBooks());
            studentLibrary.returnBook(b4, "Sam");
            System.out.println(studentLibrary.findAvailableBooks());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
