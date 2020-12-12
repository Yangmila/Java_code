package experiment32;
import java.util.*;

public class Lottery {
		public static String ticketCreate() {
			int a;
			String result = null;
			ArrayList<Integer> list=new ArrayList<Integer>();
			Random r=new Random();
			System.out.println("1.22选5，2.33选7,3.双色球");
			Scanner in=new Scanner(System.in);
			a=in.nextInt();
			switch(a) {
			case 1:{
				for(int x=0;x<5;x++) {
					list.add(1+r.nextInt(21));
				}
				result="22选5：";
				break;
			}
			case 2:{
				for(int x=0;x<7;x++) {
					list.add(1+r.nextInt(32));
				}
				result="33选7：";
				break;
			}
			case 3:{
				for(int x=0;x<6;x++) {
					list.add(1+r.nextInt(32));
				}
				list.add(1+r.nextInt(15));
				result="双色球：蓝球：";
				break;
			}
			default:System.out.println("重新输入");
			}
			result+=String.valueOf(list.get(0));
			for(int x=1;x<list.size()-1;x++) {
				result=result+","+String.valueOf(list.get(x));
			}
			if(a==3) {
				result+=" 红球：";
				result+=String.valueOf(list.get(list.size()-1))	;
			}
			else result+=","+String.valueOf(list.get(list.size()-1))	;
			return result;
		}
		public static void main(String [] args) {
			System.out.println(ticketCreate());
		}
	}
