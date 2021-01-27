package homework.booksystem.soperation;

import homework.booksystem.BookList;

public class Exit implements SOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("退出系统！");
        System.exit(0);
    }
}
