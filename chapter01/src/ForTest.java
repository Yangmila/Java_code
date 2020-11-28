
public class ForTest {
	public static void chengFaKouJue(){
		int i=1;
		while(i<=9){
			int j=1;
			while(j<=i){
				System.out.printf(j+"*"+i+"="+j*i+"\t");
				j++;
			}
			i++;
			System.out.println(" ");
		}
	}
}
