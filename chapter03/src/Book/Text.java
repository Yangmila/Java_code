package Book;

public class Text {
	public static void main(String[] args) {
		BookDeal deal=new BookDeal();
		
//		Book book1=new Book("211","三体1","刘慈欣","重庆出版社","科幻类");
//		deal.addBook(book1);
//		deal.delBookByName("狂人日记");
//		deal.delBookByName("十宗罪");
		
		Book book=deal.findBookByNum("231");
		System.out.println(book.name);
		Book[] book3=deal.findBooksByNameAt("三");
		for(int i=0;i<book3.length;i++){
			System.out.print(book3[i].num+",");
			System.out.print(book3[i].name+",");
			System.out.print(book3[i].author+",");
			System.out.print(book3[i].press+",");
			System.out.println(book3[i].type);
		}
		Book[] book2=deal.findBookByAuthor("鲁迅");
		for(int i=0;i<book2.length;i++){
			System.out.print(book2[i].num+",");
			System.out.print(book2[i].name+",");
			System.out.print(book2[i].author+",");
			System.out.print(book2[i].press+",");
			System.out.println(book2[i].type);
		}

	}

}
