package experiment14;

public class Text {
	public static void main(String[] args){
		Library library=new Library("Դ����ͼ���","�컪�����");
		Book book1=new Book("����","�໪",29);
		Book book2=new Book("����Ϧʰ","³Ѹ",35);
		Book book3=new Book("��������","����",22);
		Student stu1=new Student("����","Ů",19);
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
