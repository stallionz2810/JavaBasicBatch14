package class9Array;

public class ArrayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an array of names and store all names of your group then print your name from that 
		//array.use 2 different ways
		
		String[] names=new String[5];
		names[0]="Ahmad";
		names[1]="Sid";
		names[2]="Asel";
		names[3]="Samad";
		names[4]="Hashir";
		System.out.println(names[0]);
		
		//second method
		String[] name= {"Ahmad","sid","Asel","Samad","Hashir"};
		System.out.println(name[0]);
		

	}

}
