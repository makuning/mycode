public class Test01 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(3,4);
        System.out.println(v1.getSpeed());
        System.out.println(v1.getSize());
        v1.speedUp(100);
        System.out.println("加速了");
        System.out.println(v1.getSpeed());
        v1.speedDown(50);
        System.out.println("减速了");
        System.out.println(v1.getSpeed());
    }
}
