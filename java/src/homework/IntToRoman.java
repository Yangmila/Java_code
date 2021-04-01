package homework;

public class IntToRoman {
    int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String intToRoman(int num) {
        StringBuffer str = new StringBuffer();
        for(int i = 0;i < val.length;i++){
            while(val[i] <= num){
                num = num - val[i];
                str.append(symbol[i]);
            }
        }
        return str.toString();
    }
}
