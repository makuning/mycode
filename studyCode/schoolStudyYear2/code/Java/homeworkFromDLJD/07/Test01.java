public class Test01 {
    public static void main(String[] args){
        Student student1 = new Student();
        Address student1Addr = new Address();
        student1.sAddr = student1Addr;

        Student student2 = new Student();
        Address student2Addr = new Address();
        student2Addr.country = "中国";
        student2Addr.province = "江西";
        student2Addr.city = "南昌";
        student2Addr.county = "南昌县";
        student2.sAddr = student2Addr;
        student2.sName = "马昆";
        student2.sSex = true;
        student2.sClass = "软件技术19-1";
        student2.sNo = 19301079;
        
        System.out.println(student1.sName);
        System.out.println(student1.sSex);
        System.out.println(student1.sClass);
        System.out.println(student1.sNo);

        System.out.println(student1.sAddr.country);
        System.out.println(student1.sAddr.province);
        System.out.println(student1.sAddr.city);
        System.out.println(student1.sAddr.county);
        
        System.out.println("----------------------------------------");

        System.out.println(student2.sName);
        System.out.println(student2.sSex);
        System.out.println(student2.sClass);
        System.out.println(student2.sNo);

        System.out.println(student2.sAddr.country);
        System.out.println(student2.sAddr.province);
        System.out.println(student2.sAddr.city);
        System.out.println(student2.sAddr.county);

        System.out.println("----------------------------------------");

        System.out.println(student2.sAddr);

    }
}
