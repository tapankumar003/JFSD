package multithread;

public class Thread3 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<15; i++){
            System.out.println("t3: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Runnable r3 = new Thread3();
        Thread t3 = new Thread(r3);
        t3.start();
        Runnable r4 = new Thread4();
        Thread t4 = new Thread(r4);
        t4.start();
    }
}
