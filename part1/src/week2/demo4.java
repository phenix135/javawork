package week2;

public class demo4 {
    public int lengthOfLastWord(String s) {
        int index=s.length()-1;
        //去除尾部的空格
        while(s.charAt(index)==' '){
            index--;
        }
        //计算最后一个单词的长度
        int number=0;
        while(index>=0&&s.charAt(index)!=' '){
            index--;
            number++;
        }
        return number;
    }
}
