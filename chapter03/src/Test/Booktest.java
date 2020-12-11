package Test;

public class Booktest {
	public static void main(String[] args) {
		
		Bookstore bookstore=new Bookstore("新华书店","未央路","张三");
		Book book1=new Book("活着",29,"余华",5);
		Book book2=new Book("朝花夕拾",35,"鲁迅",9);
		Book book3=new Book("骆驼祥子",22,"老舍",7);
		Salesperson solder1=new Salesperson("李明","男","10789");
		Customer buyer1=new Customer("杨杰","男",200);   //所带钱数目
		bookstore.importBook(solder1,book3, 1);  //购买数量
		bookstore.buyBook(buyer1, book1, 6);
		bookstore.importBook(solder1,book1, 5);
		bookstore.buyBook(buyer1, book1, 6);
		bookstore.buyBook(buyer1, book2, 1);
		bookstore.getRemainbook(book1);
		bookstore.getRemainbook(book2);
		bookstore.getRemainbook(book3);	

	}
}
