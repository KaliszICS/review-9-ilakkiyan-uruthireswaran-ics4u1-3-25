public class PracticeProblem {

	public static int lettersToFive(String str, char letter) {
		int word = 0;
		int word2 = 0;
		while (word2 < str.length()) {
			if (str.charAt(word2) == letter){
				word++;
				if (word == 5) {
					return word2 + 1;
				}
			}
			word2++;
		} 
		return -1;
	}

	public static int countLetter(String var, char ltr) {
		int count = 0;
		for (int i = 0; i < var.length(); i++) {
			if (var.charAt(1) == ltr) {
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		int result = lettersToFive("Hope you all have a great day", 'a');
		System.out.println(result);

		int result2 = countLetter("hello", 'l');
		System.out.println(result2);
	}

}
