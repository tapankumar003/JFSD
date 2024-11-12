package overloading;

public class Engineer {

    void sleep() {
        System.out.println("Engineer is sleeping");
    }

    void sleep(int hour) {
        System.out.println("Engneer is sleeping for " + hour + " hour");
    }

    public static void main(String[] args) {
        Engineer e = new Engineer();
        e.sleep();
        e.sleep(5);
    }
}
