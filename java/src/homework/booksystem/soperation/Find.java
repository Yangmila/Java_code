package homework.booksystem.soperation;

import homework.booksystem.BookList;

import java.util.Scanner;

public class Find implements SOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("查阅书籍");
        System.out.println("请输入要查阅图书的书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for(int i = 0;i < booklist.getSize();i++){
            if(booklist.getBook(i).getName().contains(name)){
                System.out.println(booklist.getBook(i));
            }
        }
    }
}
