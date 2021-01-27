package homework.booksystem.soperation;

import homework.booksystem.Book;
import homework.booksystem.BookList;

import java.util.Scanner;

public class Return implements SOperation{
    @Override
    public void work(BookList booklist) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("归还图书");
        System.out.println("请输入要归还的图书的书名: ");
        String name = scanner.next();
        int i = 0;
        BookList bookList = null;
        for (; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                break;
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("该图书系统没有该图书, 无法归还!");
            return;
        }
        if (!bookList.getBook(i).isBorrowed()) {
            System.out.println("这本书没有借出, 无法归还!");
            return;
        }
        bookList.getBook(i).setBorrowed(false);
        System.out.println("归还成功! ");
        return;
    }
}
