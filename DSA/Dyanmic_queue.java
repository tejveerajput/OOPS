package DSA;
import java.util.*;

public class Dyanmic_queue {
    public static void main(String[] args) throws Exception{
        queue dq=new queue();
        dq.Enqueue(10);
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(40);
        dq.Enqueue(50);
        dq.display();
        Reverse(dq);
        dq.display();
        
    }
    public static void Reverse(queue dq) throws Exception{
        if(dq.isEmpty()){
            return;
        }
        int x=dq.Dequeue();
        Reverse(dq);
        dq.Enqueue(x);
    } 
    
}
