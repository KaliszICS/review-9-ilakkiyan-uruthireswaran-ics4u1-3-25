public class PracticeProblem {

	public static int lettersToFive(String str, char letter) {
		int alphabet = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == letter) {
				alphabet++;
				if (alphabet == 5) {
					return i + 1;
				}
			}
		} 
		return -1;
	}

	public static int countLetter(String var, char ltr) {
		int count1 = 0;
		for (int i = 0; i < var.length(); i++) {
			if (var.charAt(i) == ltr) {
				count1++;
			}
		}
		return count1;
	}


	public static int oddSum(int x, int y) {
		int sum = 0;
		int start = Math.min(x, y);
		int end = Math.max(x, y);

		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		return sum;
	}

	

	public static void main(String args[]) {
		int result = lettersToFive("hello lillian", 'l');
		System.out.println(result);

		int result2 = countLetter("hello", 'l');
		System.out.println(result2);

		int result3 = oddSum(0, 10);
		System.out.println(result3);
	}

}
