package homework.booksystem;

public class Book {
    private String num;
    private String name;
    private String author;
    private double price;
    private String type;
    private boolean isBorrowed = false;

    public Book(String num,String name,String author,double price,String type){
        this.num = num;
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "图书编号为'" + num + '\'' +
                ", 书名为'" + name + '\'' +
                ", 作者为'" + author + '\'' +
                ", 价格为" + price +
                ", 类别为'" + type + '\'' +
                ", 借阅状态是" + isBorrowed ;
    }

    public String getName() {
        return name;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
