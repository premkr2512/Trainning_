package ArraylistDemo; 
import java.util.*; 
class ArrayListDemo { 
    public static void main(String[] args) 
    { 
        
        int n = 5; 
  
        ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
  
        for (int i = 1; i <= n; i++) 
            arrli.add(i); 
  
        System.out.println(arrli); 
 
        arrli.remove(3);
        arrli.set(1, 74);
        System.out.println(arrli); 
        arrli.forEach((p) -> System.out.println(p)); 
    
    Iterator<Integer> iter= arrli.iterator();
while (iter.hasNext()) {
    System.out.println("Value is : "
                       + iter.next());
}
    }
} 
