package week2;

import java.util.HashMap;
import java.util.Map;

public class demo3 {
    public static int fun(String s){
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
         int sum=0;
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))< map.get(s.charAt(i+i))){
                sum -=map.get(s.charAt(i));
            }else{
                sum +=map.get(s.charAt(i));
            }
        }
        return sum;
    }
}
