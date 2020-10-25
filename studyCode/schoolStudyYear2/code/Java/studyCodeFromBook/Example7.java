public class Example7{
    public static void main(String[] args){
        int[] nums = {1,5,5,8,7,1,8,7,15,8,1,5,78,7,1,7,8,4,1,84,87,8,48,4,87,8,84,8,48,7,8,84,5,5,8,7,87,8,8,88,8,8888,888};
        
        System.out.println("下面有一组数：");
        for(int i = 0;i < nums.length;i++){
            System.out.print(nums[i] + "\t");
        }
        int max = Calculate2.getMaxNum(nums);
        System.out.println();
        System.out.print("最大的数为：" + max);
    }
}
class Calculate2{
    public static int getMaxNum(int[] nums){
        int maxNum = nums[0];

        for(int i = 1;i < nums.length;i++){
            if(maxNum < nums[i]){
                maxNum = nums[i];
            }
        }
        
        return maxNum;
    }
}
