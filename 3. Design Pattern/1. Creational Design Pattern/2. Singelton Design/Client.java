public class Client {
    public static void main(String[] args) {
        System.out.println(SingeltonClass.createInstance().hashCode());

        System.out.println(SingeltonClass.createInstance().hashCode());
    }
}
