package Algo;
import java.util.*;

public class BinarySearch {
	public static void main(String args[]){
		
		Scanner listelem = new Scanner(System.in);
		Scanner find = new Scanner(System.in);
		ArrayList<Integer> ls = new ArrayList<Integer>();
		int pos,num;
		
		/*Input to an arraylist*/
		System.out.println("Please enter some numbers:");
		while(listelem.hasNextInt()) {
			ls.add(listelem.nextInt());
		}
		
		/*Number to be searhed in the list*/
		System.out.println("Enter number to be searched:");
		num = find.nextInt();
		
		/*Calling binary search function to find if elem is present in the list*/
		pos = bsearch(ls, num);
		if(pos == -1)
			System.out.print("Elem not found");
		else 
			System.out.println("Element " + num + " found at position "+ pos);
	}
	
	public static int bsearch(ArrayList<Integer> elems, int n ){
		int high,low,mid;
		high = elems.size() - 1;
		low = 0;
		mid = 0;
		
		while(high>=low){
			mid = low + ((high-low)/2);
			if(elems.get(mid) == n)
				break;
			else if(elems.get(mid)<n)
				low = mid + 1;
			else
				high = mid - 1 ;
		}
		if(high>low ) 
			return -1;
		else 
			return mid;
	
	}

}

