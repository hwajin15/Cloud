package array;

public class ObjectCopy1 {
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copylibrary = new Book[5];
        library[0] = new Book("java", "se");
        library[1] = new Book("c", "j");
        library[2] = new Book("자료구조", "jin");
        library[3] = new Book("c++", "hwa");
        library[4] = new Book("안드로이드", "se");

        copylibrary[0] =new Book();
        copylibrary[1] =new Book();
        copylibrary[2] =new Book();
        copylibrary[3] =new Book();
        copylibrary[4] =new Book();

        for (int i =0; i<library.length; i++){
            copylibrary[i].setTitle(library[i].getTitle());
            copylibrary[i].setAuthor(library[i].getAuthor());
        }

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
