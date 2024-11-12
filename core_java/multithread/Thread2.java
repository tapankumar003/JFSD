package multithread;

public class Thread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<11; i++){
            System.out.println("t2: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
