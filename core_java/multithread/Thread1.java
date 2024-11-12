package multithread;

public class Thread1 extends Thread{
    @Override
    public void run() {
        
        for(int i = 0; i<11; i++){
            System.out.println("t1: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
        
    }
}
