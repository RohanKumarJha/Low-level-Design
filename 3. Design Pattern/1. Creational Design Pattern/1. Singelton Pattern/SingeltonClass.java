public class SingeltonClass {

    private static SingeltonClass singeltonClass;

    private SingeltonClass() {
        System.out.println("Create instance");
    }

    public static SingeltonClass createInstance() {
        if(singeltonClass == null) {
            singeltonClass = new SingeltonClass();
        }
        return singeltonClass;
    }
}