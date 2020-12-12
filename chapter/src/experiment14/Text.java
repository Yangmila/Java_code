package experiment14;

public class Text {
	public static void main(String[] args){
		Library library=new Library("源汇市图书馆","庆华大道旁");
		Book book1=new Book("活着","余华",29);
		Book book2=new Book("朝花夕拾","鲁迅",35);
		Book book3=new Book("骆驼祥子","老舍",22);
		Student stu1=new Student("钟娜","女",19);
		library.importBook(book3, 3);  
		library.buyBook(stu1, book1, 6);
		library.importBook(book1, 5);
		library.buyBook(stu1, book3, 3);
		library.buyBook(stu1, book2, 1);
		library.getRemainbook(book1);
		library.getRemainbook(book2);
		library.getRemainbook(book3);
		
	}
}
