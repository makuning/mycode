/*
    从控制台获取一个数作为行数输出以下的图
       *
      ***
     *****
    *******
*/
public class Homework5{
    public static void main(String[] args){
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.print("请输入行号：");
        int userRowsNum = userInput.nextInt();


        System.out.println("图形如下所示：");
        for(int i = 1;i <= userRowsNum;i++){
            for(int j = 1;j <= (userRowsNum - i);j++){
                System.out.print(' ');
            }
            for(int k = 1;k <= (i * 2 - 1);k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}