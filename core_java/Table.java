public class Table {

    void table(int a){
        for(int i=1; i<11;i++){
            System.out.print(a*i+" ");
        }
    }
    public static void main(String[] args) {
        Table t = new Table();
        int a = 2;
        t.table(a);
    }
}
