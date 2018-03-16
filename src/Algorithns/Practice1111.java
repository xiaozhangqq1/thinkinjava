package Algorithns;

import java.util.Locale;

/**
 * Created by zhangxuelong on 2018/3/16
 */
public class Practice1111 {

    public static void main(String[] args) {
        String[][] arr = {{"*", ""},{"","*"}};
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
        }

        boolean[][] booleans = {{true,false},{true,true}};
        System.out.println();
        for (int i = 0;i<booleans.length;i++){
            for (int j = 0;j<booleans[i].length;j++){
                if (booleans[i][j]){
                    System.out.println(String.format(Locale.CHINA,"%d %d *",i+1,j+1));
                }else {
                    System.out.println(String.format(Locale.CHINA,"%d %d  ",i+1,j+1));
                }
            }
        }
    }


}
