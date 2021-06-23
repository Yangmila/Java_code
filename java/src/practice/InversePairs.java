package practice;
//JZ35 数组中的逆序对
//在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
//输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。
public class InversePairs {
    //方法一：暴力解决
    public int InversePairs1(int [] array) {
        int len = array.length;
        int ret = 0;
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if (array[i] > array[j]) {
                    ret += 1;
                    ret %= 1000000007;
                }
            }
        }
        return ret;
    }
    //方法二：归并排序
    //先把数组分割成子数组，先统计出子数组内部的逆序对的数目，然后再统计出两个相邻子数组之间的逆序对的数目。
    // 在统计逆序对的过程中，还需要对数组进行排序。如果对排序算法很熟悉，我们不难发现这个过程实际上就是归并排序。
    int count=0;
    int[]temp;
    public int InversePairs(int [] array) {
        temp=new int[array.length];
        mergeSort(array,0,array.length-1);
        return count;
    }
    public void mergeSort(int[]array,int left,int right){
        if(left>=right) return;
        int mid=(left+right)/2;
        mergeSort(array,left,mid);
        mergeSort(array,mid+1,right);
        merge(array,left,mid,right);
    }
    //合并[left,mid],[mid+1,right]这两个有序数组的同时计算逆序对
    public void merge(int[]array,int left,int mid,int right){
        int i=left,j=mid+1;
        int k=left;
        //当前面数组（即i指针）移动时，在j之前的都是比i小的元素
        while(i<=mid&&j<=right){
            if(array[i]<=array[j]){
                temp[k++]=array[i++];
                count=(count+(j-mid-1))%1000000007;
            }
            else temp[k++]=array[j++];
        }
        while(i<=mid){
            temp[k++]=array[i++];
            count=(count+(right-mid))%1000000007;;
        }
        while(j<=right){
            temp[k++]=array[j++];
        }
        //将temp的值转入array
        for(k=left;k<=right;k++)
            array[k]=temp[k];
    }
}
