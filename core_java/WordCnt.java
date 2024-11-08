public class WordCnt {
    public void wdCnt(String wd){
        int a = wd.split(" ").length;
        System.out.println("The given sentence has "+a+" words");
    }
    public static void main(String[] args) {
        String ln = "I am a coder";
        WordCnt ww = new WordCnt();
        ww.wdCnt(ln);
    }
}
