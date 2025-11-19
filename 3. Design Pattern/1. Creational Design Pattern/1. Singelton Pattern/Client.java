public class Client {
    public static void main(String[] args) {
        SingeltonClass singeltonClass1 = SingeltonClass.createInstance();
        System.out.println(singeltonClass1.hashCode());

        SingeltonClass singeltonClass2 = SingeltonClass.createInstance();
        System.out.println(singeltonClass2.hashCode());
    }
}
