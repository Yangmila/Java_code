package homework;

import java.util.Scanner;

public class MP3 {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strNum = scanner.nextInt();
        String cmd = scanner.nextLine();
        findSongsList(strNum, cmd);
    }

    private static void findSongsList(int n, String cmd){
        int l = cmd.length();
        int firstSongIndex = 1;
        int curTarget = 1;
        int i = 0;
        while (i<l) {
            char curr = cmd.charAt(i);
            if (curr=='U'){
                if(curTarget==1){
                    if(n>4) firstSongIndex = n-3;
                    curTarget = n;
                } else {
                    if (curTarget==firstSongIndex) firstSongIndex--;
                    curTarget--;
                }
            } else {
                if (curTarget==n){
                    firstSongIndex=1;
                    curTarget=1;
                } else {
                    if (curTarget==firstSongIndex+3) firstSongIndex++;
                    curTarget++;
                }
            }
            i++;
        }
        int disCount = Math.min(4,n);
        for (int j = 1; j <=disCount; j++, firstSongIndex++) {
            System.out.print(firstSongIndex);
            System.out.print((j==disCount) ? "\n" : " ");
        }
        System.out.println(curTarget);
    }
}
