/*Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output: The new list is : 1 2 3 5
*/

public class ArrayDeleteEl{
	public static void main(String args[]){
		
		int arr[]={1,2,3,4,5};
		int ind = 3;
		
		for(int i=arr.length-1;i>ind;i--){
			arr[i-1] = arr[i];
		}
		for(int i=0;i<arr.length-1;i++){
			System.out.printf("%d | ",arr[i]);
		}
		
		/*
		for(int i=0;i<arr.length;i++){
			if(i!=ind){
				System.out.printf("%d | ",arr[i]);
			}
		}
		*/
		
	}
}

