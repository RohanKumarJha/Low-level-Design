public class User {
    public static void main(String[] args) {
        Vehicle vehicle1 = new MotorCycle();
        vehicle1.travel("Inderlok", "Noida");

        Vehicle vehicle2 = new Bus();
        vehicle2.travel("Noida", "Gurgaon");

        Vehicle vehicle3 = new Train();
        vehicle3.travel("Delhi", "Faridabad");
    }
}