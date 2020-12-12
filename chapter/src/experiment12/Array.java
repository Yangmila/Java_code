package experiment12;

public class Array {
	public static void niXu(String str[]){
		for(int i = str.length - 1;i >= 0 ;i--){
			System.out.printf(str[i]);
		}
	}
//并集	
	public static void add(int[] a,int[] b){
		int[] c = new int[20];
		int k = a.length;
		for(int i = 0; i < a.length;i++){
			c[i] = a[i];
		}
		for(int i = 0;i < b.length;i++){
			int o = 0;
			for(int j = 0;j < k;j++){
				if(b[i] == c[j]){
					o = 1;
				}
			}
			if(o == 0){
				c[k++] = b[i];
			}
		}
		for(int i = 0;i < k;i++){
			System.out.print(" " + c[i]);
		}
	}
//交集	
	public static void Minus(int[] a,int[] b){
		int[] c = new int[20];
		int k = 0;
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < b.length;j++){
				if(a[i] == b[j]){
					c[k++] = b[j];
					break;
				}
			}
		}
		for(int i = 0;i < k;i++){
			System.out.print(" " + c[i]);
		}
	}
}
