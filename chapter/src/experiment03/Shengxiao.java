package experiment03;
import experiment04.Computer;
public class Shengxiao {
		public static void shengXiao(int year){
			int jieguo=year%12;
			switch(jieguo){
			case 0:
	            System.out.println("��");
	            break;
	        case 1:
	            System.out.println("��");
	            break;
	        case 2:
	            System.out.println("��");
	            break;
	        case 3:
	            System.out.println("��");
	            break;
	        case 4:
	            System.out.println("��");
	            break;
	        case 5:
	            System.out.println("ţ");
	            break;
	        case 6:
	            System.out.println("��");
	            break;
	        case 7:
	            System.out.println("��");
	            break;
	        case 8:
	            System.out.println("��");
	            break;
	        case 9:
	            System.out.println("��");
	            break;
	        case 10:
	            System.out.println("��");
	            break;
	        case 11:
	            System.out.println("��");
	            break;

			}
		}
		
		public static void main(String[] args){
			Shengxiao.shengXiao(2020);
			Shengxiao.shengXiao(2000);
		}
}

