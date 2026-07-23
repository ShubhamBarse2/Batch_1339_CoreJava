package TypeOf_Inheritance_RefCode;

public class Daughter extends Father, Mother {
//	
	public static void main(String[] args) {
		
		// Diamond Problem 
		
		// Ambiguity = Confusion 
		
		Daughter d = new Daughter();
		d.show();
		d.show();
	}
	
}
