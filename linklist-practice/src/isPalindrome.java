import java.util.Scanner;
import java.util.ArrayList;
//回文数程序
public class isPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // next方式接收字符串
        System.out.println("接收：");
        // 判断是否还有输入
        int number = 0;
        if (scan.hasNextInt()) {
            number = scan.nextInt();
            System.out.println("输入的数据为：" + number);
        }
        scan.close();

        boolean result = judge(number);
        System.out.println("is the number:" + result);
    }

    public static boolean judge(int x){
        ArrayList<Integer> splitnum = new ArrayList<Integer>();
        double flag = 0;
        if ( x < 0){
            return  false;
        }else if ( x < 10){
            return true;
        }
        while ( x >= 10 ){
            splitnum.add(0,x%10);
            x = (x - x%10)/10;
            System.out.println(x);
        }

        splitnum.add(0,x);

        while(splitnum.get(0)==splitnum.get(splitnum.size()-1)){
            splitnum.remove(0);
            splitnum.remove(splitnum.size()-1);
            System.out.println("length：" + splitnum.size());
            if (splitnum.size()<=1){
                return true;
            }
        }

            return false;


    }
}
