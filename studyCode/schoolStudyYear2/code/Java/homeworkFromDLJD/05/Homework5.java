/*
    �ӿ���̨��ȡһ������Ϊ����������µ�ͼ
       *
      ***
     *****
    *******
*/
public class Homework5{
    public static void main(String[] args){
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.print("�������кţ�");
        int userRowsNum = userInput.nextInt();


        System.out.println("ͼ��������ʾ��");
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