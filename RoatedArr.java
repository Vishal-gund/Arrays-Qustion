/*
3. Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:

	12 14 18 20 22 25 27 0 3  6 9
*/

public class RoatedArr{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};
		int ind = 2;
		
		for(int i=0;i<ind;i++){
			int temp = arr[0];// 1
			for(int j=0;j<arr.length-1;j++){
				arr[j] = arr[j+1]; // 2 
			}
			
			arr[arr.length-1] = temp; 
		}
		for(int i=0;i<arr.length;i++){
			System.out.printf("%d | ",arr[i]);
		}
	}
}