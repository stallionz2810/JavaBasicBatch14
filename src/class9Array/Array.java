package class9Array;

public class Array {

	public static void main(String[] args) {
		int[] arr=new int[4];
		//store elemets inside an array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//accessing elements from the array
		System.out.println(arr[2]);//30
		
		System.out.println(arr[1]+arr[2]);//50
		// Lests create an array and store your classmates
		
		String[] names=new String[5];
		names[0]="Shah";
		names[1]="Vera";
		names[2]="Sid";
		names[3]="Guljan";
		
		System.out.println("Hello "+names[1]);
		
		

	}

}
