public class ForTest09_1{
	
	public static void main(String[] args){
		
		System.out.println("2 3 5 7");
		
		int j=0;
		
		for(int i=10;i<=100;i++){
			if((i%2!=0)&(i%3!=0)&(i%5!=0)&(i%7!=0)){
				System.out.print(i+"\t");
				j++;
				if(j%8==0){
					System.out.print("\n");
				}
			}
		}
        
		System.out.println("--------------------");
	
	}
}

//这时实现每8个数据一换行的代码