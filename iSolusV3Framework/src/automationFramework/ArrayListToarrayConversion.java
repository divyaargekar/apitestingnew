package automationFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayListToarrayConversion {
  static int arr1[]= {2,4,6,3,2,4,5};
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 List<Integer> al=new ArrayList<Integer>();
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);
	 Object[] obj= al.toArray();
	 for(Object objects:obj)
	 {
		 System.out.println(objects);
	 }
	 Arrays.sort(arr1, 1, 4);
	 
	 System.out.println(Arrays.toString(arr1));

	}

}
