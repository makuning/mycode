/*
    ����һ�����������ж��Ƿ�Ϊ����
    ����1�ͱ���֮��û������������������
*/
public class Homework4{
    public static void main(String[] args){
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("������һ�������������ж����Ƿ�Ϊ����");
        int userNum = userInput.nextInt();
        boolean result = true;

        for(int i = 2;i < userNum;i++){
            if(userNum % i == 0){
                result = false;
            }
        }
        if(result){
            System.out.println("�����������������");
        }else{
            System.out.println("�����������������");
        }
    }
}