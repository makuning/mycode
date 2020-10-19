class Example5{
    public static void main(String[] args){
        int [] array1 = {0,1,2,3,4,5,6,7,8,9};
        int [] array2 = {0,0,0,0,0,0,0,0,0,0};

        System.out.print("array2:");

        System.arraycopy(array1,1,array2,0,6);
        for(int i = 0;i < array2.length;i++){
            System.out.print(array2[i] + "   ");
        }
    }
}