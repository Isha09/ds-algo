package Algo;
import java.util.*;

public class insertionSort {
	
	public static void swap(ArrayList<Integer> sw, int cur, int prev){
		
		int temp;
		temp = sw.get(prev);
		sw.set(prev,sw.get(cur));
		sw.set(cur,temp);
		
	}

	public static ArrayList<Integer> insSort(ArrayList<Integer> vals )    {
		  int currInd;
		  for ( int pos=1; pos < vals.size() ; pos++ ) {
		    currInd = pos ;
		    while ( currInd > 0 && (vals.get(currInd) < vals.get(currInd-1)) ) {
		      swap(vals, currInd, currInd-1);
		      currInd = currInd - 1;
		    }
		  }
	  return vals;
	}
		  
	public static void main(String[] args) {
		Scanner listelem = new Scanner(System.in);
		Scanner find = new Scanner(System.in);
		ArrayList<Integer> ls = new ArrayList<Integer>();
		int pos;
		
		/*Input to an arraylist*/
		System.out.println("Please enter some numbers:");
		while(listelem.hasNextInt()) {
			ls.add(listelem.nextInt());
		}
		insSort(ls);
		
		ls = insSort(ls);
		for(int n= 0;n<ls.size();n++){
			System.out.println(ls.get(n)+" ");
		}

	}

}
