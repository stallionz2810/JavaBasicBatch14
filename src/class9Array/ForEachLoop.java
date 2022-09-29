package class9Array;

public class ForEachLoop {

	public static void main(String[] args) {
		//only when we deal with arrays or collections
		//we can use for each loop.enhanced for loop,advanced for loop
		
		String[] iceCream= {"vanila","chocolate","pistachio","kulfi","mango"};
		
		for(String flavor:iceCream) {
			System.out.println(flavor);
		}
		System.out.println("----------------");
		
		char [] letters= {'A','B','C','D'};
		for(char letter:letters) {
			System.out.print(letter+" ");
		}
		System.out.println("------------");
		
		int[] number= {12,56,345,1,0,9};
		//get all elements using regular for loop
		
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i]+" ");
			
		}
		System.out.println();
		//get all values using enhanced for loop
		for(int num:number) {
			System.out.print(num+" ");
		}

	}

}
