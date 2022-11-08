package week2.array;

import java.util.ArrayList;

public class BookStart {
    public static void main(String[] args) {
        // 객체생성
        BookController bookController = new BookController(); // 컨트롤러 접근 객체생성
        // Book book = new Book("바껴라","딱용");  // 바꿀책 객체 생성
        Book newbook = new Book("추가","추가"); //    추가 책 객체생성
        String title = "바껴라ㅏㅏㅏㅏㅏㅏㅏㅏ"; // 바꿀책 타이틀만 변경
        ArrayList<Book> library1 = bookController.library_a(); // a도서관 ?? 얕은복사?? 밑에 복사의미가 있나모르겠네
        ArrayList<Book> copy = library1; // a도서관 복사
        ArrayList<Book> library2 = bookController.library_b(); // b도서관

        // 출력
        bookController.show(library1,copy,library2);

        // 수정&추가
        bookController.update(library1,title); // 책 수정
        bookController.plus(library2,newbook); // 책 추가

        // 수정 추가 후 출력
        System.out.println("------------------------ 수정,추가 작업 후 조회 ------------------------");
        bookController.show(library1,copy,library2);
    }
}
