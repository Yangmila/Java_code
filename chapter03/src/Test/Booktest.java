package Test;

public class Booktest {
	public static void main(String[] args) {
		
		Bookstore bookstore=new Bookstore("�»����","δ��·","����");
		Book book1=new Book("����",29,"�໪",5);
		Book book2=new Book("����Ϧʰ",35,"³Ѹ",9);
		Book book3=new Book("��������",22,"����",7);
		Salesperson solder1=new Salesperson("����","��","10789");
		Customer buyer1=new Customer("���","��",200);   //����Ǯ��Ŀ
		bookstore.importBook(solder1,book3, 1);  //��������
		bookstore.buyBook(buyer1, book1, 6);
		bookstore.importBook(solder1,book1, 5);
		bookstore.buyBook(buyer1, book1, 6);
		bookstore.buyBook(buyer1, book2, 1);
		bookstore.getRemainbook(book1);
		bookstore.getRemainbook(book2);
		bookstore.getRemainbook(book3);	

	}
}
