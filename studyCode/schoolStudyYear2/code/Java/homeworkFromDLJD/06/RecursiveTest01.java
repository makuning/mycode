/*
    用递归求一个数的递归加总和
*/
public class RecursiveTest01{
    public static void main(String[] args){
        int num = 20;
        int result1 = Numerical.sum(num);
        long result2 = Numerical.factorial(num);

        System.out.println(result1);
        System.out.println(result2);
        
    }
}

class Numerical{
    public static int sum(int num){
        /*
            递归重要点：
            1、设置停止条件
            2、
        */
        if(num == 1){
            return 1;
        }
        return num + sum(num - 1);
    }

    public static long factorial(int num){
        /*
            递归重要点：
            1、设置停止条件
            2、
        */
        if(num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
}