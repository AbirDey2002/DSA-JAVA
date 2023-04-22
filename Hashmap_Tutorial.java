import java.util.*;

class Hashmap_Tutorial{
  public static void main(String []args){

    // HashMap named map (key:String type ,value:Integer type)
    HashMap<String,Integer> map = new HashMap<>();

    //insertion
    map.put("India", 120);
    map.put("US",30);
    map.put("China",150);

    System.out.println(map); // 1st print, unordered mapping

    map.put("China",180);

    System.out.println(map);  // key to value updation to latest insert

    System.out.println(map.containsKey("China"));  // if key value exists

    System.out.println(map.get("China"));  //  key exists, returns value 
    System.out.println(map.get("Korea"));  //  key not exists, returns null
    
    //  Iterating through HashMAp

    System.out.println("Iterating through HAshMap");    
    for(Map.Entry<String,Integer> e : map.entrySet()){
      System.out.println(e.getKey()+" "+e.getValue());
    }


  }
}