public class HelloWorldConsole {
	public static void main(String[] args) {
		
		boolean doQuit = false;
		
		while(!doQuit) {
			
			System.out.print("Select one of the following:\n" +
				"\t[D]eutsch\n" +
				"\t[E]nglish\n" +
				"\t[F]rancais\n" +
				"[Q]uit\n" +
				"> ");

			char input = 0;	
			
			try {
				// Read one byte (= one character) from input stream
				input = (char)System.in.read();				

				// Convert input to lower case
				input = Character.toLowerCase(input);

				// Remove Enter-Key from input stream 
				System.in.read();	
			} catch(java.io.IOException e) {
				System.out.println("Error while reading input.");
			}
			
			switch(input) {
				case 'd': 
					System.out.println("Guten Tag!\n");
					break;
				case 'e':
					System.out.println("Hello!\n");
					break;
				case 'f':
					System.out.println("Bonjour!\n");
					break;
				case 'q': 
					doQuit = true;
					break;
				default:
					System.out.println("Input not recognized. Pleasy try again.\n");
					break;
			}
		}
	}
}
