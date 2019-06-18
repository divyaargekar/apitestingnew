package automationFramework;
import java.util.Arrays;
public class Arrayofclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		Object[] obj1= {arr1};
		Object[] obj2= {arr2};
		
		int a[]= {1,2,3,4};
		int b[]= {5,6,7};
		int c[]=new int[2];
		
		int d[]= {10,11,12,11,14,15};

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=0;k<c.length;k++)
				{
				c[k]=a[i]+b[j];
				System.out.println(c[k]);
				}
			}
		}
		for(int l=0;l<d.length;l++)
		{
			if(d[l]==11)
			{
				System.out.println("D value"+d[l]);
				
				
			}
		}
		if(Arrays.deepEquals(obj1, obj2))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("not Same");
		}
		
		 final int arr3[] = {1, 2, 3, 4, 5}; 
	       int arr4[] = {10, 20, 30, 40, 50}; 
	       arr4 = arr3;       
	   
	       for (int i = 0; i < arr3.length; i++) 
	          System.out.println(arr3[i]);         
	}
	
}
