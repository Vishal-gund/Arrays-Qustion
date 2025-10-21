/*Q4. Write a program in java to find the smallest missing element from a sorted array?
		Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2
		
		also added all missing num
*/

public class SmallestMissing{
	public static void main(String args[]){
		int arr [] ={0,2,3,4,5,6,7,9};
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]+1 < arr[i+1]){
				System.out.print(arr[i]+1);
				break;
			}
		}
	}
}
