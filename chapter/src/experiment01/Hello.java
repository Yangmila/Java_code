package experiment01;

public class Hello {
	public static void main(String[] args) {
		A a=new A("F15");
		a.apple();
		a.banana();
		
		B deal=new B();
		System.out.println(deal.getRankByScore(76));
		System.out.println(B.getRankByScore1(98));
		
		C c=new C( );
		System.out.println(c.rank(44));
		System.out.println(C.rank1(86));
	}
}
