public class Test01{
    
    public static void main(String[] args){
        new A();
    } 
}

class A{
    public A(){
        this(1);
        System.out.println("A的无参构造执行了。");
    }
    public A(int i){
        this(1,2D);
        System.out.println("A的有参构造执行了。（int）");
    }
    public A(int i,double d){
        System.out.println("A的有参构造执行了。（int，double）");
    }
}

class B{
    public B(){
        System.out.println("B的无参构造执行了。");
    }
}

class C{
    public C(){
        System.out.println("C的无参构造执行了。");
    }
}