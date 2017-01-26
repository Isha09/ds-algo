package Algo;
import java.util.*;

/*Prog to find elem using linear search*/

public class LinearSearch {
	
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
	
	/*Calling linear search function to find if elem is present in the list*/
	pos = lsearch(ls, num);
	if(pos == -1)
		System.out.print("Elem not found");
	else 
		System.out.println("Element " + num + " found at position "+ pos);
	
	
   }
	
	public static int lsearch(ArrayList<Integer> elems, int n ){
		int i;
		for(i=0 ; i < elems.size() ; i++){
			if(elems.get(i) == n)
				break;
		}
		if(i < elems.size() ) 
			return i+1;
		else 
			return -1;
	
	}

}
