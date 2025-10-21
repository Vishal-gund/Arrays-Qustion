/*Q2. Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array
*/
public class MajorityElement{
	public static void main(String args[]){
		int arr[] ={4,8,4,6,7,4,4};
		int sKey = 4;
		int count =0;
		boolean found = false;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == sKey){
				count++;
			}
			
			if(count > arr.length/2){
				System.out.printf("Majority = %d",arr[i]);
				found = true;
				break;
			}
		}
		if(!found){
			System.out.print("Not found element");
		}
	}
}