package homework.booksystem.soperation;

import homework.booksystem.BookList;

public class Show implements SOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("显示图书");
        for(int i = 0;i < booklist.getSize();i++){
            System.out.println(booklist.getBook(i));
        }
    }
}
