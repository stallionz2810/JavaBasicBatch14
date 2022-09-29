package class9Array;

public class Task1 {

	public static void main(String[] args) {
		/*create an array of chars and store grades into in
		 * ABCDEF.Then print a grade B(use 2 different 
		 * ways of creating an array
		 */
		char[] grades=new char[7];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
	//second method
		char[] grade= {'A','B','C','D','E','F'};
		System.out.println(grade[1]);
		

	}

}
