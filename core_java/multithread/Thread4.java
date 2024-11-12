package multithread;

public class Thread4 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<15; i++){
            System.out.println("t4: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}
