/*
    ¼ÆËã1+2-3+4-5+6-7+8........+100µÄÖµ
*/
public class Homework2{    
    public static void main(String[] args){
        int result = 1;

        for(int i = 2;i <= 100;i++){
            if(i % 2 == 0){
                result += i;
            }else{
                result -= i;
            }
        }

        System.out.println(result);
    }
}