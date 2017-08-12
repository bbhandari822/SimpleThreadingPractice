
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Binod Bhandari on 8/11/17.
 */

public class MultiThreading extends Thread{

   public static void main(String[] args) throws Exception {

       Greeting obj1 = new Greeting();
       obj1.start(); // call this thread to begin it's execution
       Thread.sleep(1); //temporally cease the execution for 1 milli second and resumes back

       People obj2 = new People();
       obj2.start();

   }
}
    class Greeting extends Thread{
        public void run(){

            for(int i = 0; i < 5; i++){
                System.out.println("Hello");

                try{
                    Thread.sleep(1000);
                }catch (InterruptedException ex){
                    //Logger object is used to log message from Greeting class.
                    Logger.getLogger(Greeting.class.getName()).log(Level.SEVERE, null, ex);
                    //Level identifier, SEVERE will prevent normal execution of program
                }
            }

        }

    }

    class People extends Thread{
        public void run(){
            // run for 5 times with the interval of 500 millis
            for(int i = 0; i < 5; i++){
                System.out.println("People");

                try{
                    Thread.sleep(1000);
                }catch (InterruptedException ex){
                    Logger.getLogger(People.class.getName()).log(Level.SEVERE, null,ex);
                }
            }
        }

    }