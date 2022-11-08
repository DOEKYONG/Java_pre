package week2.array;

import java.util.ArrayList;

public class BookController {

    public ArrayList<Book> library_a() {
        ArrayList<Book> library1 = new ArrayList<>();
        library1.add(new Book("태백산맥","조정래"));
        library1.add(new Book("이기적 유전자","리처드 도킨즈"));
        library1.add(new Book("자전거 도둑","박완서"));
        library1.add(new Book("대변동","제레드 다이아몬드"));
        library1.add(new Book("대변동","제레드 다이아몬드"));
        return library1;
    }
    public ArrayList<Book> library_b(){
        ArrayList<Book> library2 = new ArrayList<>();
        library2.addAll(library_a());
        return library2;
    }

    void update(ArrayList<Book>list ,String title){
        for(int i = 0 ; i<list.size(); i++) {
           if(list.get(i).getTitle().equals("자전거 도둑")){
               list.get(i).setTitle(title);
           }
        }
    }
    void plus(ArrayList<Book> list, Book book) {
        list.add(book);
    }
    public void show(ArrayList<Book>libraryA,ArrayList<Book>libraryA_1,ArrayList<Book>libraryB ){
        System.out.println("A도서관 : " + libraryA);
        System.out.println("A_1 : " + libraryA_1);
        System.out.println("B도서관 : " + libraryB);
    }



}
