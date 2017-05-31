import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrintEvenNumbers {

	
	public void EvenNumbersFuctions(){
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(11);
		numbers.add(12);
		numbers.add(14);
		numbers.add(17);
		numbers.add(10);
		numbers.add(9);
		numbers.add(20);
		
		System.out.println("Size is : "+numbers.size());
		
		for(Iterator<Integer> i = numbers.iterator(); i.hasNext();)
		{
			Integer num = i.next();
			if(num%2==0){
				//System.out.println(numbers);
				i.remove();
			}
		}
		
		Collections.sort(numbers);
		System.out.println("List is : "+numbers);
		
	}
	public static void main(String[] args) {
		
		PrintEvenNumbers obj= new PrintEvenNumbers();
		obj.EvenNumbersFuctions();
	}
}
