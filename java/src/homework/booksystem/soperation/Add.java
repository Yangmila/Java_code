package homework.booksystem.soperation;

import homework.booksystem.Book;
import homework.booksystem.BookList;

import java.util.Scanner;

public class Add implements SOperation{
    @Override
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("添加图书");
        System.out.println("请输入新的图书的编号：");
        String num = scanner.next();
        System.out.println("请输入新的图书的书名: ");
        String name = scanner.next();
        System.out.println("请输入新的图书的作者: ");
        String author = scanner.next();
        System.out.println("请输入新的图书的价格: ");
        double price = scanner.nextDouble();
        System.out.println("请输入新的图书的类别: ");
        String type = scanner.next();
        Book newBook = new Book(num,name,author,price,type);

        bookList.setBook(bookList.getSize(),newBook);
        bookList.setSize(bookList.getSize() + 1);
        System.out.println("添加图书成功！");
    }

}
