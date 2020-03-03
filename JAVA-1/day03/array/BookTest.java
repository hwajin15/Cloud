package array;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        library[0] = new Book("java", "se");
        library[1] = new Book("c", "j");
        library[2] = new Book("자료구조", "jin");
        library[3] = new Book("c++", "hwa");
        library[4] = new Book("안드로이드", "se");


        for (int i =0; i< library.length; i++){
            System.out.println(library[i]);
            library[i].BookInfo();
        }
    }
}
