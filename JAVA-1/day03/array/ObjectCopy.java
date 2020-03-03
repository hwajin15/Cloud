package array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copylibrary = new Book[5];
        library[0] = new Book("java", "se");
        library[1] = new Book("c", "j");
        library[2] = new Book("자료구조", "jin");
        library[3] = new Book("c++", "hwa");
        library[4] = new Book("안드로이드", "se");

        System.arraycopy(library,0,copylibrary,0,5);

//        for (Book book : copylibrary){
//            book.BookInfo();
//        }
        library[0].setTitle("나무");
        library[0].setAuthor("jeong");

        for (Book book : library){
            book.BookInfo();
        }
        System.out.println("----------------------");
        for (Book book : copylibrary){
            book.BookInfo();
        }
    }
}
