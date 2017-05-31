import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CopyAllElements {

	Set<Object>map1 = null;
	Set<Object> map2 = null;
	public void setMethod(){
		
		map1= new HashSet<Object>();
		
		map1.add("A");
		map1.add("B");
		map1.add("C");
		map1.add("D");
		map1.add("E");
		
		map2= new HashSet<Object>();
		map2.add("1");
		map2.add("2");
		map2.add("3");
		map2.add("4");
		map2.add("5");
		
		Set<Object> union = new TreeSet<Object>(map1);
		System.out.println("Before Copy All Elements from Set2 : "+union);
		
		union.addAll(map2);
		
		System.out.println("After Copy All Elements from Set2 : "+union);
	}
	public static void main(String[] args) {
		
		CopyAllElements obj = new CopyAllElements();
		obj.setMethod();
	}
}
