package homework.booksystem;

import homework.booksystem.soperation.SOperation;

abstract public class User {
    protected String name;
    protected SOperation[] operations;

    public abstract int menu();

    public void doOperation(int choice,BookList bookList){
        SOperation operation = this.operations[choice - 1];
        operation.work(bookList);
    }
}
