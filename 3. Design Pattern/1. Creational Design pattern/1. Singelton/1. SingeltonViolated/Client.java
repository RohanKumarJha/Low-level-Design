public class Client {
    public static void main(String[] args) {
        Databse databse1 = new Databse();
        System.out.println(databse1.hashCode());

        Databse databse2 = new Databse();
        System.out.println(databse2.hashCode());
    }
}
