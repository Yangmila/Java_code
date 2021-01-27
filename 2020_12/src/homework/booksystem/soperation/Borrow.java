package homework.booksystem.soperation;

import homework.booksystem.BookList;

import java.util.Scanner;

public class Borrow implements SOperation{
    @Override
    public void work(BookList booklist) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("借阅图书");
        System.out.println("请输入要借阅的图书的书名: ");
        String name = scanner.next();

        int i;
        BookList bookList = null;
        for (i = 0; i < bookList.getSize(); i++) {
            if (bookList.getBook(i).getName().equals(name)) {
                break;
            }
        }
        if (i >= bookList.getSize()) {
            // 没找到
            System.out.println("该图书系统中没有该图书,无法借阅!");
            return;
        }
        if (bookList.getBook(i).isBorrowed()) {
            System.out.println("该图书已经被借出!");
            return;
        }
        bookList.getBook(i).setBorrowed(true);
        System.out.println("借书成功!");
    }
}
