public class Test01{
    
    public static void main(String[] args){
        new A();
    } 
}

class A{
    public A(){
        this(1);
        System.out.println("A���޲ι���ִ���ˡ�");
    }
    public A(int i){
        this(1,2D);
        System.out.println("A���вι���ִ���ˡ���int��");
    }
    public A(int i,double d){
        System.out.println("A���вι���ִ���ˡ���int��double��");
    }
}

class B{
    public B(){
        System.out.println("B���޲ι���ִ���ˡ�");
    }
}

class C{
    public C(){
        System.out.println("C���޲ι���ִ���ˡ�");
    }
}