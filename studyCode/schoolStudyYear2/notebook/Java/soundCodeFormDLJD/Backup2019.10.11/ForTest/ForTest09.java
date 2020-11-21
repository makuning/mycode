
//找出1-100之间的素数
//素数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。又被称为质数
//也就时只能被1和本身整除

public class ForTest09{
	
	public static void main(String[] args){
		
		System.out.println("2 3 5 7");
		
		for(int i=10;i<=100;i++){
			if((i%2!=0)&(i%3!=0)&(i%5!=0)&(i%7!=0)){
				System.out.println(i);
			}
		}

	}
}

/*
升级版：
	找出1-10000之间的素数
	要求每8个数字换行输出
*/