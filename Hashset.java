import java.util.*; 
public class HashSetDemo { 
public static void main(String[] args) { 
Set<String> set = new HashSet<String>(); 
set.add("red"); 
set.add("yellow"); 
set.add("white"); 
set.add("red"); 
set.add(null); 
set.add("orange"); 
set.add(null); 
System.out.println(set); 
} 
}
