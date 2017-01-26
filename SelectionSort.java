package Algo;
import java.util.*;

public class SelectionSort {
	
	public static void swap(ArrayList<Integer> sw, int minpos, int maxpos){
		int temp;
		temp = sw.get(maxpos);
		sw.set(maxpos,sw.get(minpos));
		sw.set(minpos,temp);
		
	}
	
	public static ArrayList<Integer> selsort(ArrayList<Integer> ar) {
		int i,j,indexmin;
		for(i=0;i<ar.size()-1;i++){
			indexmin = i;
			for(j=i+1;j<ar.size();j++){
				if(ar.get(indexmin)>ar.get(j)){
					indexmin = j ;
				}
					
			}
			
			swap(ar,indexmin,i);
		}
		return ar;
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
		ls = selsort(ls);
		for(int n= 0;n<ls.size();n++){
			System.out.println(ls.get(n)+" ");
		}
			
		

	}

}
