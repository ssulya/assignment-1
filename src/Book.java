package library;
public class Book{
    private int id;
    private static int idGen=1;
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(){
        id=idGen++;
        available=true;
    }
    public Book(String t,String a,int y){
        this();
        setTitle(t);
        setAuthor(a);
        setYear(y);
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public boolean isAvailable(){
        return available;
    }
    public void setTitle(String t){
        if (t==null||t.equals("")){
            throw new IllegalArgumentException("empty name");
        }
        title=t;
    }
    public void setAuthor(String a){
        if(a==null||a.equals("")){
            throw new IllegalArgumentException("empty author");
        }
        author = a;
    }

    public void setYear(int y) {
        if (y < 1500 || y > 2025) {
            throw new IllegalArgumentException("false year");
        }
        year=y;
    }
    public void markAsBorrowed(){
        available=false;
    }
    public void markAsReturned() {
        available=true;
    }

    public String toString() {
        return "Book id="+id+" title="+title+" author="+author+" year="+year+" available="+available;
    }
}