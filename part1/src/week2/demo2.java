package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//9.回文数
public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fun(n));

    }
    public static boolean fun(int n){
        if(n<0){
            return false;
        }
        int t; //t为n的最后一位
        List<Integer> list=new ArrayList<>();

        while(n>0){
            t=n%10;
            list.add(t);
            n=n/10;
        }
        int flag=1;//为回文数,(n=0时，也为1）
        for(int i=0,j= list.size()-1;i< j;i++,j--){
            if(list.get(i)!= list.get(j)){
                flag=0;
            }
        }
        if(flag==1){
            return true;
        }else{
            return false;
        }
    }
}
