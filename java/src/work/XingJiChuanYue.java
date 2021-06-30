package practice;
//星际穿越
import java.util.Scanner;
//如果在发射过程中，产生了 x 程度的损耗，那么在降落的过程中就会产生 x2 程度的损耗，
// 如果飞船的总损耗超过了它的耐久度，飞行器就会爆炸坠毁。问一艘耐久度为 h 的飞行器，
// 假设在飞行过程中不产生损耗，那么为了保证其可以安全的到达目的地，只考虑整数解，至多发射过程中可以承受多少程度的损耗？
public class XingJiChuanYue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            long h = scanner.nextLong();
            for(long i = (long)Math.sqrt(h);i >= 0;i--){
                if(i * (i + 1) <= h){
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
