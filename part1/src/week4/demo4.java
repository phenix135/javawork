package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo4 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
        List<Double> list = new ArrayList<>();
        for (int k = nums.length; k >= 1; k--) {


             int a[]=new int[k];
             for (int i = 0; i <=k-1; i++) {
             a[i]=nums[i];
             }
           // System.out.println(Arrays.toString(a));
          //  System.out.println(a[0]);               //分别将数组nums的前k项提取出来，按原来的顺序组成新数组a[]

             //a={1}
             // a={1,0}
             // a={1,0,1}
             // a={1,0,1,1},计算出Xnum.length()
             double j = 0; //最开始的指数
             double number = 0; //pow()函数的参数为double类型，所以只能用double接
             for (int i = a.length - 1; i >= 0; i--) {
             number += a[i] * Math.pow(2, j);
             j++;
             }

             list.add(number);

        }

       System.out.println(list);

    }
    }


