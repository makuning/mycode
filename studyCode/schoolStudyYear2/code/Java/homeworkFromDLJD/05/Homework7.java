/*
    �ҳ�1000���ڵ�����
    ������������ֵǡ�õ������������ӵĺ�
    ���ӣ�
        6=1+2+3
*/
public class Homework7{
    public static void main(String[] args){
        
        for(int i = 2;i <= 1000;i++){
            int num = 0;
            
            for(int j = 1;j <= (i / 2);j++){

                if((i % j) == 0){
                    num += j;
                }
                
            }
            
            if(i == num){
                System.out.println(i);
            }
        }
    
    }
}