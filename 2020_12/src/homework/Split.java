package homework;

public class Split {
    public static void main(String[] args) {
        String str = "hello word";
        String str1 = " ";

        String[] a = yang_split(str, str1);
        for(int i = 0; i< a.length; i++){
            System.out.println(a[i]);
        }

    }

    public static String[] yang_split(String str, String str1) {
        int size = 1;
        for(int k = 0; k < str.length(); k++) {
            if (str.substring(k,k+1) != null && (str.substring(k,k+1)).equals(str1)) {
                size++;
            }
        }

        String[] arr= new String[size];
        String strTemp = "";

        int len = str.length();
        int index =0;
        int i = 0;
        while (len > 1){
            index = str.indexOf(str1);
            if (index>0){
                strTemp = str.substring(0, index);
                str = str.substring(index+1);
                arr[i++] = strTemp;
            } else if (index==0){
                str = str.substring(index+1);
                arr[i++] = "";
            } else{
                break;
            }
            len = str.length();
        }

        index = str.indexOf(str1);
        if(index == 0){
            arr[i++] = "";
            arr[i] = "";
        }else{
            arr[i] = str;
        }

        return arr;
    }
}
