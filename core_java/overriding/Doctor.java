package overriding;

public class Doctor extends Human{
    @Override
    void sleep() {
        // TODO Auto-generated method stub
        super.sleep();
        System.out.println("And now Doctor is sleeping");
    }
    public static void main(String[] args) {
        Doctor dr = new Doctor();
        dr.sleep();
    }
}
