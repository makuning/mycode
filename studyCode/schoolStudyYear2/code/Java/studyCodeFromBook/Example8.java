/*
    ��ϰ�����ð������
*/
public class Example8 {
    public static void main(String[] args){
        int [] nums = {115,1151,84,848,846,89,1,58,87,17,35,65,18,98,78};
        
        Calculate1.rankSToB(nums);
    }
}

class Calculate1{
    public static void rankSToB(int[] nums){
        int temp = 0;

        for(int i = 0;i < nums.length;i++){
            System.out.print(nums[i] + "\t");
        }
        for(int i = 0;i < nums.length - 1;i++){
            for(int j = 0;j < nums.length - i - 1;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println();
        for(int i = 0;i < nums.length;i++){
            System.out.print(nums[i] + "\t");
        }
    }
}