package setDemo;
import java.util.*; 
public class setDemo {
 
 public static void main(String[] args)
 {
     
     Set<String> hash_Set = new HashSet<String>();

     hash_Set.add("Geeks");
     hash_Set.add("For");
     hash_Set.add("Geeks");
     hash_Set.add("Example");
     hash_Set.add("Set");

     System.out.println(hash_Set);
     Iterator<String> itr = hash_Set.iterator();
  System.out.println("Traversing over Set using Iterator");
  while(itr.hasNext()){
    System.out.println(itr.next());
  }
 }
}

