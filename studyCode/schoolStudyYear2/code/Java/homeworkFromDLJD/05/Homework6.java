/*
    小芳的妈妈每天会给她2.5块零花钱，但是每五天小芳就会花掉6块钱，那么过多少天小芳才能有100块钱
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
                System.out.println("小芳存满" + money + "元，需要" + day + "天。");
                break;
            }
        }
    }
}