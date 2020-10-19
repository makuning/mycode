public class KeyInput{
    public static void main(String[] args){
        //创建一个键盘扫描器对象
        java.util.Scanner s = new java.util.Scanner(System.in);
        //从键盘上接收一个int类型的数据
        //等待用户输入，用户可以从键盘上输入一个整数，然后回车，回车之后
        //变量就有值了，并且变量中保存的这个值是用户输入的数字
        int userInputNum = s.nextInt();

        System.out.println("您输入的数字是" + userInputNum);

        String userInputStr = s.next();

        System.out.println("您输入的字符串是" + userInputStr);
    }
}