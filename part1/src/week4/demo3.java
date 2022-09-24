package week4;

import java.util.ArrayList;
import java.util.List;

public class demo3 {
    public static void main(String[] args) {
        int nums[]={0,1,1};
        System.out.println(prefixesDivBy5(nums));
    }
    public static List<Boolean> prefixesDivBy5(int[] nums) {
          List<Double> list=new ArrayList<>();
          for(int k= nums.length;k>=1;k--){

              int a[]=new int[k];
              for (int i = 0; i <=k-1; i++) {
                  a[i]=nums[i];
              }                     //分别将数组nums的前k项提取出来，按原来的顺序组成新数组a[]

               //a={1)
               // a={1,0}
               // a={1,0,1}
               // a={1,0,1,1},计算出Xnum.length()
               double j = 0; //最开始的指数
               double number = 0; //pow()函数的参数为double类型，所以只能用double接
               for (int i = a.length - 1; i >= 0; i--) {
                   number += a[i] * Math.pow(2, j);
                   j++;
               }
               list.add(number); //此时存入的元素为X3,X2,X1,X0
           }
       // System.out.println(list);
              //先将集合变数组，将元素调整为正序
           Double[]arr=list.toArray(list.toArray(new Double[0]));
        for (int i = 0,j= arr.length-1;i<=j;i++,j--) {
            double t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
           List<Boolean> bool=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

                if ( arr[i]% 5 == 0) {
                    bool.add(true);
                } else {
                    bool.add(false);
                }
            }

        return bool;
    }
}
