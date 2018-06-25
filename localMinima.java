package codeing;

public class LocalMinima {
	public static void main(String[] args) {
		int[] arr= {3, 2, 1};
		for(int i=0;i<arr.length;i++) {
			if(i==0 ) {
				if(arr[i]<=arr[i+1]) {
					System.out.println(i);
				}
			}
			else if(i==arr.length-1) {
				if( arr[i]<=arr[i-1]) {
					System.out.println(i);
				}
			}
			else {
				if(arr[i]<=arr[i-1] && arr[i]<=arr[i+1]) {
					System.out.println(i);
				}
			}
			
		}
		
	}
}
