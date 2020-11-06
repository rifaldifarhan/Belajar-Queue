/**
 *
 * @author Rifaldi
 */
public class CobaQueueStatis {
    public static void main(String[] args) {
         Queue Q = new Queue();
        
        Q.createEmpty();
        Q.printQueue();
        
        System.out.println("=================================================");
        
        Q.add("E31202038", "Farhan Rifaldi", 86.22);
        Q.add("E41202192", "Ilham Nugraha", 84.57);
        Q.add("E41201747", "Yoga Andrian", 92.65);
        
        Q.printQueue();
        
        System.out.println("=================================================");
        
        Q.del();
        Q.del();
        Q.printQueue();
                
        System.out.println("=================================================");
        
    }
}
