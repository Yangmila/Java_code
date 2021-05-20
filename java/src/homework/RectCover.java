package homework;

//矩形覆盖
//F(i)=F(i - 1)+F(i - 2)
public class RectCover {
    public int rectCover(int target) {
        if(target == 0 || target == 1 || target == 2){
            return target;
        }
        int a = 1;
        int b = 2;
        int c = 0;
        for(int i = 3;i <= target;i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
