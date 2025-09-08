package CollectionFramework;
  import java.util.ArrayList;
  import java.util.*;

public class ProgramListIterator {
  

  
  
    public static void main(String[] args) {
      ArrayList<Integer> l1 = new ArrayList<>();
             l1.add(23);
             l1.add(12);
             l1.add(34);
             l1.add(78);
             
             
             // Traverse in Forward
             ListIterator<Integer> lit =  l1.listIterator();
             while(lit.hasNext()) {
               System.out.println(lit.next());
             }
             System.out.println("==================");
              
             
             // Traverse in Backward
             while(lit.hasPrevious()) {
               System.out.println(lit.previous());
             }
             
    }
  
  }
  
