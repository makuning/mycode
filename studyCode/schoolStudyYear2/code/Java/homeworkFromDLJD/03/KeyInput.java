public class KeyInput{
    public static void main(String[] args){
        //����һ������ɨ��������
        java.util.Scanner s = new java.util.Scanner(System.in);
        //�Ӽ����Ͻ���һ��int���͵�����
        //�ȴ��û����룬�û����ԴӼ���������һ��������Ȼ��س����س�֮��
        //��������ֵ�ˣ����ұ����б�������ֵ���û����������
        int userInputNum = s.nextInt();

        System.out.println("�������������" + userInputNum);

        String userInputStr = s.next();

        System.out.println("��������ַ�����" + userInputStr);
    }
}