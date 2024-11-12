package inharitance;

public class Child extends Parent{
    String name = "Tapan";
    String address = "Balasore";
    
    public static void main(String[] args) {
        Child t = new Child();
        System.out.println(t.bankBalance);
    }
}
