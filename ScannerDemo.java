/**
 * @author Christelle 
 * 
 * Allan Krasner and Genti Malo
 * 
 */
public class ScannerDemo {

	private static String file1 = "c:\\Users\\Allan\\IdeaProjects\\ScannerParser\\src\\prog2.jay";
	private static int counter = 1;

	public static void main(String args[]) 
	{

		TokenStream ts = new TokenStream(file1);

		System.out.println(file1);

		Token t;
		
		while (!ts.isEndofFile()) {

			t = ts.nextToken();
			System.out.println("Token " + counter + ":" + "\tValue= " + t.getValue() + "\t\t\t\t" + "Type= " + t.getType());
			counter ++;
		}
		

		
	}
}
