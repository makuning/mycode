/*
    ����дһ����ΪAccount����ģ���˻���
    ��������Ժͷ���������ʾ��
    �������������:�˻�id,���balance,������annualInterestRate:
    �����ķ���:�����Ե�set��get������ȡ���wi thdraw(),����deposit ()
    дһ�����Գ���
    (1)����һ��customer, ���ֽ�Jane Smith, ����- -���˺�Ϊ1000�� ���Ϊ2000�� ������Ϊ1.
    (2)��Jane Smith����:
    ����100Ԫ����ȡ��960Ԫ����ȡ��2000��
    ��ӡJane Smith�Ļ�����Ϣ
    ��Ϣ������ʾ:
    �ɹ�����: 100
    �ɹ�ȡ��: 960
    ���㣬ȡǮʧ��
    Customer [ Smith, Jane] has a account : id is 1000 annualInterestRate is 1.238 balance is 15151.
*/
public class Test01{
    public static void main(String[] args){
        Account a1 = new Account();
        Customer c1 = new Customer();

        a1.setId("1000");
        a1.setBalance(2000);
        a1.setAnnualInterestRate(1.21);

        c1.setFirstname("Jane");
        c1.setLastname("Smith");
        c1.setAccount(a1);

        c1.getAccount().withdarw(100);
        c1.getAccount().deposit(960);
        c1.getAccount().deposit(2000);
        c1.typeInformation();

        Account lixinyiAccount = new Account("20021026", 5201314, 10);
        Customer lixinyi = new Customer("��", "����", false, "20021026", lixinyiAccount);

        lixinyi.getAccount().withdarw(5555555);
        lixinyi.getAccount().deposit(12345);
        lixinyi.getAccount().deposit(789798);
        lixinyi.typeInformation();

        Account makunAccount = new Account("20010624",2500,10);
        Customer makun = new Customer("��", "��", true, "20010624", makunAccount);
        makun.getAccount().withdarw(2000);
        makun.getAccount().deposit(4200);
        makun.getAccount().deposit(500);
        makun.typeInformation();
    }
}