package week2;
//1.两数之和
public class demo1 {
    public static int[] fun(int []arr,int target){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                if(arr[i]+arr[j]==target){
                    int []result={i,j};
                    return result;
                }
            }
        }
        return null;
    }
}
