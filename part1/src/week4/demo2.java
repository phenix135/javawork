package week4;

import java.util.ArrayList;
import java.util.List;

//234 会文链表
public class demo2 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();

        //先将链表中的数据存入集合中
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }

        //在比较集合中的元素是否对称
        for (int i = 0, j =list.size()-1;i<=j; i++,j--) {
            if(list.get(i)!= list.get(j)){
                return false;
            }
        }
        return true;
    }
}
