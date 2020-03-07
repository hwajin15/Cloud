package object;
class Book implements Cloneable{
    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
    @Override
    protected  Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class objectex {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("토지", "박경리");
        System.out.println(book);

        String str = new String("토지");
        System.out.println(str);
        System.out.println(str.toString());  //object 메소드
        System.out.println(str.hashCode());

        Book book2 =(Book)book.clone();
    }
}
