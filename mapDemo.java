package mapDemo;
import java.util.*;


class mapDemo {
 public static void main(String args[])
 {
     Map<String, Integer> hm
         = new HashMap<String, Integer>();
     Set<String> s = new HashSet<>();
     hm.put("a", 100);
     hm.put("b", 200);
     hm.put("c", 300);
     hm.put("d", 400);
     for (Map.Entry<String, Integer> me :
          hm.entrySet()) {
         System.out.print(me.getKey() + ":");
         System.out.println(me.getValue());
     }
     System.out.println(hm.isEmpty());
     s = hm.keySet();
     System.out.println("The set is: " + hm.entrySet());
 }
}

