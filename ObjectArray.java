package codeing;

 class Student {
	int rollNumber;
	String name;
	
	Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
}

 /**
 * @author nayanathomas
 *
 */
public class ObjectArray {
	 
	 
	 public static void main(String args[]) {
		 ObjectArray obj = new ObjectArray();
		 
		 Student[] studentArray = new Student[4];
		 studentArray[0] = new Student(1,"Athulya");
		 studentArray[1] = new Student(2,"Ganga");
		 studentArray[2] = new Student(3,"Nayana");
		 studentArray[3] = new Student(4,"Priya");
		 
	 
	 	for(int i=0;i<studentArray.length;i++) {
	 		System.out.println(studentArray[i].name);
	 	}
	 	
	 	int arr[] = obj.mem();
	 	System.out.println(arr[0]);
	 	
	 	//rotated array
	 	int[] rotatedArray = obj.rotate(arr, 2, 7);
	 	for(int i=0;i<rotatedArray.length;i++) 
	 		System.out.print(rotatedArray[i]);
	 	
	 	System.out.println();
	 	int[] antiRotatedArray = obj.anti_rotate(arr, 2, 7);
	 	for(int i=0;i<antiRotatedArray.length;i++) 
	 		System.out.print(antiRotatedArray[i]);
	 }
	 
	 public int[] mem() {
	 		return new int[]{1, 2, 3, 4, 5, 6, 7};
	 	}
	 
	 
	 /**
	 * a function rotate(ar[], d, n) that rotates arr[] of size n by d elements CLOCKWISE.
	 */
	public int[] rotate(int arr[], int d, int n) {
		 int[] a =new int[n];
		 for(int i=0;i<n; i++) {
			 a[(i+d)%n] = arr[i];
		 }
		 return a;
	 }
	
	/**
	 * a function rotate(ar[], d, n) that rotates arr[] of size n by d elements ANTI-CLOCKWISE.
	 */
	public int[] anti_rotate(int arr[], int d, int n) {
		 int[] a =new int[n];
		 for(int i=0;i<n; i++) {
			 a[(n-d+i)%n] = arr[i];
		 }
		 return a;
		 
//		 Time complexity : O(n * d)
//		 Auxiliary Space : O(1)
//		 int[] a =arr;
//		 int j;
//		 for(int i=0;i<d; i++) {
//			int temp = arr[0];
//			for(j=0;j<n-1;j++) {
//				a[j] = arr[j+1];
//			}
//			a[j] = temp;
//		 }
//		 return a;
	 }
}