package experiment32;
import java.util.*;

public class Lottery {
		public static String ticketCreate() {
			int a;
			String result = null;
			ArrayList<Integer> list=new ArrayList<Integer>();
			Random r=new Random();
			System.out.println("1.22ѡ5��2.33ѡ7,3.˫ɫ��");
			Scanner in=new Scanner(System.in);
			a=in.nextInt();
			switch(a) {
			case 1:{
				for(int x=0;x<5;x++) {
					list.add(1+r.nextInt(21));
				}
				result="22ѡ5��";
				break;
			}
			case 2:{
				for(int x=0;x<7;x++) {
					list.add(1+r.nextInt(32));
				}
				result="33ѡ7��";
				break;
			}
			case 3:{
				for(int x=0;x<6;x++) {
					list.add(1+r.nextInt(32));
				}
				list.add(1+r.nextInt(15));
				result="˫ɫ������";
				break;
			}
			default:System.out.println("��������");
			}
			result+=String.valueOf(list.get(0));
			for(int x=1;x<list.size()-1;x++) {
				result=result+","+String.valueOf(list.get(x));
			}
			if(a==3) {
				result+=" ����";
				result+=String.valueOf(list.get(list.size()-1))	;
			}
			else result+=","+String.valueOf(list.get(list.size()-1))	;
			return result;
		}
		public static void main(String [] args) {
			System.out.println(ticketCreate());
		}
	}
