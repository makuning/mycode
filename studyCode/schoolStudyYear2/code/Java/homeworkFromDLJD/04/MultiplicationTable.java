public class MultiplicationTable{
    public static void main(String[] args){
        //������д
        // for(int i = 1;i < 10;i++){
        //     for(int k = 1;k < 10;k++){
        //         if(i < k){
        //             continue;
        //         }
        //         System.out.print(k + "��" + i + "=" + (i * k) + "\t");
        //     }
        //     System.out.println();
        // }
        //����Ľ�
        for(int i = 1;i < 10;i++){
            for(int j = 1;j <= i;j++){ 
                System.out.print(j + "��" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}