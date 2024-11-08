public class squareNum {
    public void squre(int num){
        int sqNum = num * num;
        System.out.println("Squrare of "+num+" = "+sqNum);
    }
    public static void main(String[] args) {
        squareNum s = new squareNum();
        s.squre(5);
    }
}
