/*
    С��������ÿ������2.5���㻨Ǯ������ÿ����С���ͻỨ��6��Ǯ����ô��������С��������100��Ǯ
*/
public class Homework6{
    public static void main(String[] args){
        double money = 0D;
        int day = 0;
        while(true){
            day++;
            money += 2.5D;
            if(day % 5 == 0){
                money -= 6D;
            }
            if(money >= 100D){
                System.out.println("С������" + money + "Ԫ����Ҫ" + day + "�졣");
                break;
            }
        }
    }
}