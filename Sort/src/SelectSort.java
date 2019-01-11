/*
        选择排序
 */
public class SelectSort {
    public static void main(String[] args){
        int[] a = {3,1,6,2,5};
        for(int i = 0;i<a.length-1;i++){
            int min = i;
            for(int j = i;j<a.length-1;j++){
                if(a[min] > a[j+1]){
                    min = j+1;
                }
            }
            if(min != i){
                int temp;
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        for(int i=0 ;i<5; i++){
            System.out.println(a[i]);
        }
    }
}
