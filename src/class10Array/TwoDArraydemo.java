package class10Array;

public class TwoDArraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countries= {
                {"Usa", "Canada"}, //1 array with index 0
                {"Peru", "Brazil", "Colombia", "Ecuador"}, //2 array with index 1
                {"Ethiopia", "Egypt", "Kenya"},
                {"Germany", "Turkiye", "Moldova", "Ukraine"},
                {"Kazakhstan", "Afghanistan", "Korea"}
        };
		System.out.println("-------getting all values from 2d array-----");
		for(int r=0; r<countries.length; r++) {
			for(int c=0; c<countries[r].length; c++) {
				System.out.println(countries[r][c]);
			}
			System.out.println();
		}
		

	}

}
