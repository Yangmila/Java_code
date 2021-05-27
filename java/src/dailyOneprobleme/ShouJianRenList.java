package dailyOneprobleme;

import java.util.ArrayList;
import java.util.Scanner;

//收件人列表
public class ShouJianRenList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            scanner.nextLine();
            ArrayList<String> arrayList = new ArrayList<>();
            for(int i = 0;i < n;i++){
                String name = scanner.nextLine();
                if(name.contains(" ") || name.contains(",")){
                    arrayList.add("\"" + name +"\"");
                }else {
                    arrayList.add(name);
                }
            }
            for (int i = 0;i < n - 1;i++){
                System.out.print(arrayList.get(i)+", ");
            }
            System.out.println(arrayList.get(n - 1));
        }
    }
}
