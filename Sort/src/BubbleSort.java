/*
  冒泡排序算法：
    int类型的数据：3,1,6,2,5
*/
public class BubbleSort {
 public static void main(String[] args){
      int[] a = {3,1,6,2,5};
      //开始排序

      int count=0;
      while(count==0){
          for(int i = 4;i>0;i--){
              for(int j=0;j<i;j++){
                  if(a[j]>a[j+1]){
                      int temp;
                      temp = a[j];
                      a[j]=a[j+1];
                      a[j+1]=temp;
                      count=0;
                  }
                  count=1;
              }
          }
      }
      for(int i=0 ;i<5; i++)
      System.out.println(a[i]);

  }
}
