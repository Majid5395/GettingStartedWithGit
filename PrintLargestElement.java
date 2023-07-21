package ArrayProgram;

public class PrintLargestElement {
	public static void main(String[] args) {
		int[] arr= {7,8,19,16} ;
		int max =arr[0];
		for(int i=0; i < arr.length; i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		System.out.println("The Largest Element Amoung these are " + " = " +max);
	}

}
