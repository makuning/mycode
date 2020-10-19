/*
    接收一个正整数，判断是否为质数
    除了1和本身之外没有其他因数的正整数
*/
public class Homework4{
    public static void main(String[] args){
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("请输入一个整数，用来判断其是否为质数");
        int userNum = userInput.nextInt();
        boolean result = true;

        for(int i = 2;i < userNum;i++){
            if(userNum % i == 0){
                result = false;
            }
        }
        if(result){
            System.out.println("您输入的数是质数。");
        }else{
            System.out.println("您输入的数不是质数");
        }
    }
}