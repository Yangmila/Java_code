package homework.booksystem;

public class BookList {
    private Book[] books = new Book[50];
    private int size = 0;

    public BookList(){
        books[0] = new Book("001","朝花夕拾","鲁迅",35,"文学散文");
        books[1] = new Book("002","三体","刘慈欣",99,"科幻小说");
        books[2] = new Book("003","骆驼祥子","老舍",29,"文学小说");
        books[3] = new Book("004","十宗罪","蜘蛛",108,"悬疑小说");
        size = 4;
     }

    public Book getBook(int index) {
        return books[index];
    }

    public void setBook(int index,Book book) {
        books[index] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
