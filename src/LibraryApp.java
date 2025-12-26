package library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void run(){
        while (true){
            System.out.println("1 print books 2 add book 3 search 4 borrow book 5 return book 6 delete book 7 quit");
            int c=sc.nextInt();
            sc.nextLine();
            if (c== 1) printBooks();
            else if (c==2) addBook();
            else if (c== 3) search();
            else if (c==4) borrow();
            else if (c==5) giveBack();
            else if (c==6) delete();
            else if (c==7) break;
        }
    }
    void printBooks() {
        if (books.size()==0){
            System.out.println("no books");
            return;
        }
        for (int i=0;i<books.size();i++) {
            System.out.println(books.get(i));
        }
    }

    void addBook(){
        System.out.print("name: ");
        String t=sc.nextLine();
        System.out.print("author: ");
        String a=sc.nextLine();
        System.out.print("Year: ");
        int y=sc.nextInt();
        sc.nextLine();

        books.add(new Book(t, a, y));
    }

    void search(){
        System.out.print("Text: ");
        String s=sc.nextLine().toLowerCase();
        for (int i=0;i<books.size();i++){
            if (books.get(i).getTitle().toLowerCase().contains(s)){
                System.out.println(books.get(i));
            }
        }
    }

    void borrow(){
        System.out.print("ID: ");
        int id=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<books.size();i++){
            if (books.get(i).getId()==id){
                if (books.get(i).isAvailable()){
                    books.get(i).markAsBorrowed();
                }
                return;
            }
        }
        System.out.println("nt found");
    }
    void giveBack(){
        System.out.print("id: ");
        int id=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<books.size(); i++){
            if(books.get(i).getId() == id){
                books.get(i).markAsReturned();
                return;
            }
        }
    }
    void delete(){
        System.out.print("id: ");
        int id=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<books.size();i++){
            if (books.get(i).getId()==id){
                books.remove(i);
                return;
            }
        }
    }
    public static void main(String[] args){
        new LibraryApp().run();
    }
}