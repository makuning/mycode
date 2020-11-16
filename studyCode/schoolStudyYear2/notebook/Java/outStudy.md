## Java 注释

>```java
>//这是单行注释
>
>/*
>	这是多行注释（第一行）
>	这是多行注释（第二行）
>*/
>
>/**
>*在此注释中的内容会自动被javadoc.exe生成帮助文档
>*javadoc.exe是jdk安装目录下的bin目录里的命令
>*被提取并生成到帮助文档中
>*javadoc的命令很复杂 
>*/
>public class HelloWorld{
>    public static void main(String[] args){
>        System.out.println("HelloWorld");
>    }
>}
>```
>
>```java
>/*
>	1、在Java中任何有效的代码必须写到“类体”当中，最外层必须是一个类 的 定义
>	2、public表示公开的，class表示定义一个类，Test是一个类名。类名后面必须是一对大括号，这一对		大括号被称为“类体”
>	3、大括号必须是成对的，并且建议都要成对编写
>		{}
>		()
>		[]
>	4、什么时候缩进？
>		等级降级则缩进
>		有合理打的 缩进，代码会有很好的可读性
>		缩进是可读性问题，不缩进也不印象代码编译
>*/
>public calss Test{
>    //声明定义一个公开的类，起个名叫Test
>    
>    //下面这一块的代码被称为：main方法（程序的入口，SUN公司Java 语言规定的）入口方法！！！一个		类只能有一个
>    //也就是说，Java在执行程序的时候，会主动去找这样一个方法，没有这个规格的方法，程序无法执行
>    //main方法也叫主方法，方法必须放到“类体”中，不能放到“类体”外边
>    //对于main主方法来说，只有args能改（它是个变量名）
>    public static void main(String[] args){
>        System.out.println("Test");//作用：往控制台输出一句话，如果println后括号内的内容										是字符串的话，则必须使用双引号阔起来			
>        /*方法体：
>        	注意：方法体由一行一行的“Java语句”构成
>        	并且非常重要的是：任何一条Java语句必须以“;”结尾
>        	“;”代表一条语句的结束
>        	非常非常重要的 是：方法体中的代码遵循自上而下的的顺序依次运行执行
>        */
>        
>    }
>    
>    //写方法1（现在不执行）
>    //写方法2（会用其他方法执行）
>    //写方法3
>}
>```
>
> **注意：**
>
>1. 先写类，类中放方法（必须放main主方法），方法中放 Java语句

## Java代码实例

> **数组冒泡排序**
>
> 使用了方法，形式参数，实际参数的方式来解题
>
> ```java
> /*
>     练习数组的冒泡排序
> */
> public class Example8 {
>     public static void main(String[] args){
>         int [] nums = {115,1151,84,848,846,89,1,58,87,17,35,65,18,98,78};
>         
>         Calculate.rankSToB(nums);
>     }
> }
> 
> class Calculate{
>     public static void rankSToB(int[] nums){
>         int temp = 0;
> 
>         for(int i = 0;i < nums.length;i++){
>             System.out.print(nums[i] + "\t");
>         }
>         for(int i = 0;i < nums.length - 1;i++){
>             for(int j = 0;j < nums.length - i - 1;j++){
>                 if(nums[j] > nums[j+1]){
>                     temp = nums[j];
>                     nums[j] = nums[j+1];
>                     nums[j+1] = temp;
>                 }
>             }
>         }
>         System.out.println();
>         for(int i = 0;i < nums.length;i++){
>             System.out.print(nums[i] + "\t");
>         }
>     }
> }
> ```
>
> **求一个数组中的最大值**
>
> 使用一个变量来与数组中的每个数作比较，不断更新变量的值为大的那个，最后返回变量的值
>
> ```java
> public class Example7{
>     public static void main(String[] args){
>         int[] nums = {1,5,5,8,7,1,8,7,15,8,1,5,78,7,1,7,8,4,1,84,87,8,48,4,87,8,84,8,48,7,8,84,5,5,8,7,87,8,8,88,8,8888,888};
>         
>         System.out.println("下面有一组数：");
>         for(int i = 0;i < nums.length;i++){
>             System.out.print(nums[i] + "\t");
>         }
>         int max = Calculate2.getMaxNum(nums);
>         System.out.println();
>         System.out.print("最大的数为：" + max);
>     }
> }
> class Calculate2{
>     public static int getMaxNum(int[] nums){
>         int maxNum = nums[0];
> 
>         for(int i = 1;i < nums.length;i++){
>             if(maxNum < nums[i]){
>                 maxNum = nums[i];
>             }
>         }
>         
>         return maxNum;
>     }
> }
> ```
>



## 这里和之前差了很多



































