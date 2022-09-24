package week4;

import java.util.ArrayList;
import java.util.List;

//119.杨辉三角2
public class demo1 {
    public static void main(String[] args) {
        System.out.println(getRow(4));
    }

    public static List<Integer> getRow(int rowIndex) {
        /**
         * 将每一行都看作一个个集合row,又以row为元素，装入集合rowindexlist中
         *    1
         *   1 1
         *  1 2 1
         * 1 3 3 1
         *1 4 6 4 1
         */
        List<List<Integer>> rowindexlist = new ArrayList<>();
        //List<Integer> row = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {// i代表行数
            List<Integer> row = new ArrayList<>();

            for (int j= 0; j <= i; j++) {            //  j 代表每行的元素个数
                if (j == i||j==0) {
                    row.add(1);
                } else {
                    row.add(j, rowindexlist.get(i - 1).get(j - 1) + rowindexlist.get(i - 1).get(j));
                }

            }
            rowindexlist.add(row);
        }
        return rowindexlist.get(rowIndex);
    }
}
