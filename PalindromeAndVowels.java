import java.util.Scanner;

public class PalindromeAndVowels extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the word:");

		String word = scanner.nextLine();

		int res = checkPalindrome(word);

		if (res == 1)
			System.out.println("valid");
		else if (res == -1)
			System.out.println("invalid");
		else
			System.out.println("sentence is existed max 100 characters");

		scanner.close();
	}
}

class UserMainCode {
	public static int checkPalindrome(String word) {

		if (word.length() > 100)
			return 2;

		String palindromeWord = "";
		int count = 0;
		char vowelCheck = ' ';
		for (int i = word.length() - 1; i >= 0; i--) {

			char c = word.charAt(i);

			palindromeWord = palindromeWord + c;

			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {

				if (vowelCheck != c && vowelCheck != (char) (c - 32)) {
					vowelCheck = c;
					count++;
				} else if (c >= 'A' && c <= 'Z')
					if (vowelCheck != c && vowelCheck != (char) (c + 32)) {
						vowelCheck = c;
						count++;
					}
			}
		}

		if (palindromeWord.equals(word) && count >= 2)
			return 1;
		else
			return -1;
	}
}