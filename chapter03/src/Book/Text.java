package Book;

public class Text {
	public static void main(String[] args) {
		BookDeal deal=new BookDeal();
		
//		Book book1=new Book("211","����1","������","���������","�ƻ���");
//		deal.addBook(book1);
//		deal.delBookByName("�����ռ�");
//		deal.delBookByName("ʮ����");
		
		Book book=deal.findBookByNum("231");
		System.out.println(book.name);
		Book[] book3=deal.findBooksByNameAt("��");
		for(int i=0;i<book3.length;i++){
			System.out.print(book3[i].num+",");
			System.out.print(book3[i].name+",");
			System.out.print(book3[i].author+",");
			System.out.print(book3[i].press+",");
			System.out.println(book3[i].type);
		}
		Book[] book2=deal.findBookByAuthor("³Ѹ");
		for(int i=0;i<book2.length;i++){
			System.out.print(book2[i].num+",");
			System.out.print(book2[i].name+",");
			System.out.print(book2[i].author+",");
			System.out.print(book2[i].press+",");
			System.out.println(book2[i].type);
		}

	}

}
