package homework.booksystem.soperation;

import homework.booksystem.BookList;

import java.util.Scanner;

public class Delete implements SOperation{
    @Override
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("删除图书");
        System.out.println("请输入要删除图书的名字：");
        String name = scanner.next();

        int i;
        for(i = 0;i < bookList.getSize();i++){
            if(name.equals(bookList.getBook(i).getName())){
                break;
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("系统中没有您输入的图书 [" + name + "] ! ");
            return;
        }
        if (i == bookList.getSize() - 1) {
            bookList.setSize(bookList.getSize() - 1);
            System.out.println("删除成功");
            return;
        }
        bookList.setBook(i, bookList.getBook(bookList.getSize() - 1));
        bookList.setSize(bookList.getSize() - 1);
        System.out.println("删除成功");
    }
}
