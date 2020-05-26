package midtermex3;
import java.util.*;
public class Descendingorder {
	private static void swap(int[]
array, int i, int j)
{
	int temp= array[i];
	array[i]=array[j];
	array[j]=temp;
	
}
public static void sortdecend(int[]data, int length) {
	int maxind;
	for(int i=0; i<length-1; ++i) {
		maxind=i;
		for(int j=i; j<length; ++j) {
			if (data[j]>data[maxind]) {
				maxind=j;
			}
		}
		swap(data, i, maxind);
		for(int j=0; j< length; j++) {
			System.out.print(data[j] + "");
		}
		System.out.println();
	}
}
			
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] data = new int[10];
		int count=0;
		for(int i=0; i<data.length; i++) {
			data[i]= in.nextInt();
			if(data[i]==-1)
				break;
			++ count;
		}
		sortdecend(data, count);
	}
}

			
		
				

	


