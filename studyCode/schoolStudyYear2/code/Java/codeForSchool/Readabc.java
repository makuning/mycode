public class Test{
    public static void main(String[] args) throws Exception{
        //流
        FileInputStream fis = new FileInputStream("E:\\schoolStudyYear2\\code\\Java\\abc.txt");
       	int n = 0;
        byte []bs = new byte[8];
        while((n = fis.read(bs,0,8)) != -1){
            System.out.print(new String(bs));
        }
        fis.close();
    }
}