import java.util.*;

public class HashSet_Tutorial {
  //  HashSet(Insert) - O(n)
  //  HashSet(Search) - O(n)
  //  HAshSet(Delete) - O(n)
  public static void main(String []args){
    
    
    // HashSet creation
    HashSet<Integer> set = new HashSet<>();
    
    //Insertion
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(2);  // 2 already exist, does not append again
    System.out.println(set);

    System.out.println(set.contains(1));  // search

    set.remove(1);

    System.out.println(set);

    // Iteration
    
    for(int val:set){
      System.out.println(val);
    }


  }
}
