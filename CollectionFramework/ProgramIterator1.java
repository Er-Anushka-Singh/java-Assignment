package CollectionFramework;
  import java.util.ArrayList;
  import java.util.*;
  
  public class ProgramIterator1 {
  
    public static void main(String[] args) {
      ArrayList<Integer> l1 = new ArrayList<>();
           l1.add(23);
           l1.add(8);
           l1.add(69);
           l1.add(34);
           l1.add(65);
           l1.add(45);
           Iterator<Integer> itr = l1.iterator();
           while(itr.hasNext()) {
             if(itr.next()%2 == 1) {
               itr.remove();
             } 
           }
           System.out.println(l1);
    }
  
  }
