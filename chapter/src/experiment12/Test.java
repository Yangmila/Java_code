package experiment12;

public class Test {
	public static void main(String[] args) {
		String str1[] = {"Hello","World!"};
		String str2[] = {"abc","def"};
		
		int a1[] = {1,2,3,4,5};
		int a2[] = {6,7,8,9,0,10};
		int a3[] = {1,2,3,4,5};
		int a4[] = {5,6,7,4};
	
		Array.niXu(str1);
		System.out.println("");
		Array.niXu(str2);
		
		System.out.println("");
		Array.add(a1, a2);
		
		System.out.println("");
		Array.Minus(a3, a4);
	}
}
